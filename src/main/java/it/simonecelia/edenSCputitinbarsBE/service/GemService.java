package it.simonecelia.edenSCputitinbarsBE.service;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.Gem;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Stream;

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.hits;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusAlb;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusHib;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusMid;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.resist;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsAlb;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsHib;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsMid;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.stats;


@ApplicationScoped
public class GemService {

	public List<Gem> getGems ( Realm realm, Integer gemsNumber, String payload ) {
		var ignoreGemsNumber = gemsNumber == null || gemsNumber <= 0;
		var lines = payload.split ( "\\r?\\n" );
		var gemsFound = 0;
		var gems = new ArrayList<Gem> ();
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
			throw new RuntimeException ( "Gems number provided does not match!" );
		}
		return gems;
	}

	private Gem getGem ( Realm realm, String line, String strength ) {
		var skills = skillsAlb;
		var focuses = focusAlb;
		focuses = switch ( realm ) {
			case HIBERNIA -> {
				skills = skillsHib;
				yield focusHib;
			}
			case MIDGARD -> {
				skills = skillsMid;
				yield focusMid;
			}
			default -> focuses;
		};
		for ( var bonus : Stream.of ( skills, focuses, resist, stats, hits ).flatMap ( Stream::of ).toArray ( String[]::new ) ) {
			if ( find ( line, bonus ) ) {
				Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, bonus );
				return new Gem ( realm, strength, bonus );
			}
		}
		throw new RuntimeException ( "Gem not found! Line: " + line );
	}

	private boolean find ( String line, String word ) {
		var regex = "\\b" + Pattern.quote ( word ) + "\\b";
		var pattern = Pattern.compile ( regex, Pattern.CASE_INSENSITIVE );
		var matcher = pattern.matcher ( line );
		return matcher.find ();
	}
}
