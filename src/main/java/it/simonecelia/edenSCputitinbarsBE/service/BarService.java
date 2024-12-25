package it.simonecelia.edenSCputitinbarsBE.service;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.Gem;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.ini4j.Wini;

import java.io.File;
import java.io.IOException;
import java.util.List;


@ApplicationScoped
public class BarService {

	@Inject
	GemService gemService;

	@ConfigProperty ( name = "bar.path" )
	String barPath;

	@ConfigProperty ( name = "default.alb.crafter" )
	String defaultAlbCrafter;

	@ConfigProperty ( name = "default.hib.crafter" )
	String defaultHibCrafter;

	@ConfigProperty ( name = "default.mid.crafter" )
	String defaultMidCrafter;

	public void newBar ( Realm realm, String character, Integer gemsNumber, String payload ) throws IOException {
		var gems = gemService.getGems ( realm, gemsNumber, payload );
		if ( gems.isEmpty () ) {
			throw new RuntimeException ( "Gems not found!" );
		}
		writeBar ( gems, character );
	}

	private void writeBar ( List<Gem> gems, String character ) throws IOException {
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
		var iniFile = new File ( barPath + character + "-41.ini" );
		var ini = new Wini ( iniFile );

		var imbue = 0;
		var pieces = 0;
		for ( int i = 0; i < gems.size (); i++ ) {
			imbue += gems.get ( i ).getImbue ();
			ini.put ( "Quickbar3", "Hotkey_" + i + pieces, "45," + gems.get ( i ).getId () + ",kek,0" );
			if ( imbue > 37 ) {
				imbue = 0;
				pieces++;
				ini.put ( "Quickbar3", "Hotkey_" + i + pieces, "44,13,kek,0" );
			}
		}
		Log.infof ( "Writing Gems to: %s", iniFile );
		ini.store ();
	}
}
