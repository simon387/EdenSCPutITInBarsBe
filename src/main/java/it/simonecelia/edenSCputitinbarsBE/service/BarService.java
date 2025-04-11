package it.simonecelia.edenSCputitinbarsBE.service;

import io.quarkus.logging.Log;
import io.quarkus.runtime.util.StringUtil;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.GemModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@ApplicationScoped
public class BarService {

	@Inject
	GemService gemService;

	@ConfigProperty ( name = "default.alb.crafter" )
	String defaultAlbCrafter;

	@ConfigProperty ( name = "default.hib.crafter" )
	String defaultHibCrafter;

	@ConfigProperty ( name = "default.mid.crafter" )
	String defaultMidCrafter;

	@ConfigProperty ( name = "enable.imbue.calc" )
	boolean enableImbueCalc;

	private Wini ini;

	public void newBar ( Realm realm, String character, Integer gemsNumber, String user, String payload ) throws IOException {
		var gems = gemService.getGems ( realm, gemsNumber, payload );
		if ( gems.isEmpty () ) {
			throw new RuntimeException ( "Gem not found!" );
		}
		writeBar ( gems, character, user );
	}

	private void writeBar ( List<GemModel> gems, String character, String user ) throws IOException {
		if ( null == character ) {
			switch ( gems.getFirst ().getRealm () ) {
			case ALBION:
				character = defaultAlbCrafter;
				break;
			case HIBERNIA:
				character = defaultHibCrafter;
				break;
			case MIDGARD:
				character = defaultMidCrafter;
				break;
			}
		}
		var userName = StringUtil.isNullOrEmpty ( user ) ? System.getProperty ( "user.name" ) : user;
		var iniFile = new File ( "C:\\Users\\" + userName +
						"\\AppData\\Roaming\\Electronic Arts\\Dark Age of Camelot\\eden\\" + character + "-41.ini" );
		ini = new Wini ( iniFile );

		var pieceImbue = 0.0;
		var pieces = 0;
		var offset = 20; // start from 20 to avoid overwriting the first 20 slots
		List<GemModel> gemsToWrite = new ArrayList<> ();
		for ( var i = 0; i < gems.size (); i++ ) {
			if ( enableImbueCalc ) {
				var imbue = gems.get ( i ).getImbue ();
				if ( pieceImbue + imbue < 40 ) {
					pieceImbue += imbue;
				} else {
					pieces++;
					pieceImbue = 0;
					addSpacer ( gemsToWrite );
				}
			} else if ( gems.size () % 4 == 0 && i % 4 == 0 ) {
				addSpacer ( gemsToWrite );
			}
			gemsToWrite.add ( gems.get ( i ) );
		}
		// second pass to write the gems
		for ( var i = 0; i < gemsToWrite.size (); i++ ) {
			if ( gemsToWrite.get ( i ).getId () == 0 ) {
				writeSpacer ( i, pieces, offset );
			}
			writeSlot ( i + pieces + offset, "45," + gemsToWrite.get ( i ).getId () );
		}
		Log.infof ( "Writing Gem to: %s", iniFile );
		ini.store ();
	}

	private void addSpacer ( List<GemModel> gemsToWrite ) {
		gemsToWrite.add ( new GemModel () );
	}

	private void writeSpacer ( int index, int pieces, int offset ) {
		writeSlot ( index + pieces + offset, "44,13" ); // spacer
	}

	private void writeSlot ( int optionN, String value ) {
		ini.put ( "Quickbar3", "Hotkey_" + optionN, value + ",kek,0" );
		Log.infof ( "Writing Gem to: %d = %s", optionN, value );
	}
}
