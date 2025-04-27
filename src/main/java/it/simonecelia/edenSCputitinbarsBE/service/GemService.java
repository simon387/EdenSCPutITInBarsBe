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

import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_MID;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.HITS;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.RESIST;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALL;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_MID;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.STAT;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.UNSET;


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
					var gem = getGem ( realm, line, gemStrength );
					if ( null != gem ) {
						gems.add ( getGem ( realm, line, gemStrength ) );
						break;
					}
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

	// if returns null, it means that the line does not contain any gem
	private GemModel getGem ( Realm realm, String line, String strength ) {
		var skills = Gem.getByType ( SKILL_ALB, SKILL_ALL );
		var focuses = Gem.getByType ( FOCUS_ALB, UNSET );
		focuses = switch ( realm ) {
			case HIBERNIA -> {
				skills = Gem.getByType ( SKILL_HIB, SKILL_ALL );
				yield Gem.getByType ( FOCUS_HIB, UNSET );
			}
			case MIDGARD -> {
				skills = Gem.getByType ( SKILL_MID, SKILL_ALL );
				yield Gem.getByType ( FOCUS_MID, UNSET );
			}
			default -> focuses;
		};
		for ( var name : Stream.of ( skills, focuses, Gem.getByType ( RESIST, STAT, HITS ) ).flatMap ( Stream::of ).toArray ( String[]::new ) ) {
			if ( find ( line, name ) ) {
				Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, name );
				return new GemModel ( realm, strength, Gem.getByName ( name ) );
			}
		}
		Log.infof ( "GemModel not found! Line: ", line );
		return null;
	}

	private boolean find ( String line, String word ) {
		return Pattern.compile ( "\\b" + Pattern.quote ( word ) + "\\b", Pattern.CASE_INSENSITIVE ).matcher ( line ).find ();
	}
}
