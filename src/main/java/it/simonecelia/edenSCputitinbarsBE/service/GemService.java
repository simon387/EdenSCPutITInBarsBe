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

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.HITS;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.RESISTS;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.STATS;


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
		var skills = SKILLS_ALB;
		var focuses = FOCUSES_ALB;
		focuses = switch ( realm ) {
			case HIBERNIA -> {
				skills = SKILLS_HIB;
				yield FOCUSES_HIB;
			}
			case MIDGARD -> {
				skills = SKILLS_MID;
				yield FOCUSES_MID;
			}
			default -> focuses;
		};
		for ( var bonus : Stream.of ( skills, focuses, RESISTS, STATS, HITS ).flatMap ( Stream::of ).toArray ( String[]::new ) ) {
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
