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

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrBloodEssence;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrFocusAlbName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrFocusHibName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrFocusMidName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrResistName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrSkillsAlbName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrSkillsHibName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrSkillsMidName;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.arrStatsName;


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
		var skills = arrSkillsAlbName;
		var focuses = arrFocusAlbName;
		focuses = switch ( realm ) {
			case HIBERNIA -> {
				skills = arrSkillsHibName;
				yield arrFocusHibName;
			}
			case MIDGARD -> {
				skills = arrSkillsMidName;
				yield arrFocusMidName;
			}
			default -> focuses;
		};
		for ( var bonus : Stream.of ( skills, focuses, arrResistName, arrStatsName, arrBloodEssence ).flatMap ( Stream::of ).toArray ( String[]::new ) ) {
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
