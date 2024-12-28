package it.simonecelia.edenSCputitinbarsBE.service;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Gem;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.GemModel;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;


@ApplicationScoped
public class GemService {

	public List<GemModel> getGems ( Realm realm, Integer gemsNumber, String payload ) {
		var ignoreGemsNumber = gemsNumber == null || gemsNumber <= 0;
		var lines = payload.split ( "\\r?\\n" );
		var gemsFound = 0;
		var gems = new ArrayList<GemModel> ();
		for ( var line : lines ) {
			for ( var gemStrength : GemStrength.getArray () ) {
				if ( find ( line, gemStrength ) ) {
					gemsFound++;
					Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, gemStrength );
					gems.add ( getGem ( realm, line, gemStrength ) );
					break;
				}
			}
			if ( !ignoreGemsNumber && ( gemsFound == gemsNumber ) ) {
				break;
			}
		}
		if ( !ignoreGemsNumber && ( gemsFound != gemsNumber ) ) {
			throw new RuntimeException ( "Gem number provided does not match!" );
		}
		return gems;
	}

	private GemModel getGem ( Realm realm, String line, String strength ) {
		var skills = Gem.getAlbSkills ();
		var focuses = Gem.getAlbFocus ();
		focuses = switch ( realm ) {
			case HIBERNIA -> {
				skills = Gem.getHibSkills ();
				yield Gem.getHibFocus ();
			}
			case MIDGARD -> {
				skills = Gem.getMidSkills ();
				yield Gem.getMidFocus ();
			}
			default -> focuses;
		};
		for ( var name : Stream.of ( skills, focuses, Gem.getResists (), Gem.getStats (), Gem.getHits () ).flatMap ( Stream::of ).toArray ( String[]::new ) ) {
			if ( find ( line, name ) ) {
				Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, name );
				return new GemModel ( realm, strength, Gem.getByName ( name ) );
			}
		}
		throw new RuntimeException ( "GemModel not found! Line: " + line );
	}

	private boolean find ( String line, String word ) {
		var regex = "\\b" + Pattern.quote ( word ) + "\\b";
		var pattern = Pattern.compile ( regex, Pattern.CASE_INSENSITIVE );
		var matcher = pattern.matcher ( line );
		return matcher.find ();
	}
}
