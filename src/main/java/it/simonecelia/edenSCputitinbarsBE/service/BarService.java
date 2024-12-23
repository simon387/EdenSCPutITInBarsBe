package it.simonecelia.edenSCputitinbarsBE.service;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.Gem;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


@ApplicationScoped
public class BarService {

	String[] arrSkillsAlbName =
					{ "heated evocation sigil", "earthen fervor sigil", "heated battle jewel", "vapor war sigil", "fiery war sigil", "ashen fervor sigil",
									"vacuous fervor sigil", "icy war sigil", "earthen evocation sigil", "airy fervor sigil", "dusty battle jewel",
									"molten magma war sigil", "fiery evocation sigil", "watery fervor sigil", "icy evocation sigil", "vapor fervor sigil",
									"airy war sigil", "dusty evocation sigil", "watery evocation sigil", "salt encrusted fervor sigil", "vapor battle jewel",
									"earthen war sigil", "fiery battle jewel", "watery war sigil", "fiery fervor sigil", "steaming fervor sigil",
									"vapor evocation sigil", "earthen battle jewel", "airy battle jewel", "dusty war sigil", "heated war sigil",
									"airy evocation sigil", "finesse war sigil", "finesse fervor sigil" };

	String[] arrSkillsMidName = { "airy chaos rune", "earthen war rune", "airy primal rune", "earthen primal rune", "ashen primal rune", "airy war rune",
					"heated battle jewel", "blighted primal rune", "icy chaos rune", "dusty battle jewel", "fiery war rune", "lightning charged war rune",
					"unholy primal rune", "icy war rune", "watery chaos rune", "earthen chaos rune", "valiant primal rune", "vapor battle jewel",
					"heated chaos rune", "fiery battle jewel", "heated war rune", "airy battle jewel", "fiery primal rune", "fiery chaos rune",
					"vapor chaos rune", "dusty chaos rune", "watery war rune", "vapor war rune", "finesse war rune", "finesse primal rune" };

	String[] arrSkillsHibName =
					{ "steaming nature spell stone", "water war spell stone", "fiery war spell stone", "icy war spell stone", "earthen war spell stone",
									"heated battle jewel", "oozing nature spell stone", "aberrant arcane spell stone", "vapor arcane spell stone",
									"dusty battle jewel", "ethereal arcane spell stone", "heated war spell stone", "fiery arcane spell stone",
									"watery arcane spell stone", "earthen arcane spell stone", "airy nature spell stone", "earthen nature spell stone",
									"fiery nature spell stone", "vapor battle jewel", "phantasmal arcane spell stone", "dusty war spell stone",
									"airy war spell stone", "watery nature spell stone", "light war spell stone", "fiery battle jewel",
									"shadowy arcane spell stone", "spectral arcane spell stone", "airy battle jewel", "embracing arcane spell stone",
									"airy arcane spell stone", "mineral encrusted nature spell stone", "icy arcane spell stone", "finesse war spell stone",
									"finesse nature spell stone" };

	String[] arrFocusHibName =
					{ "steaming focus stone", "oozing focus stone", "vapor focus stone", "ethereal focus stone", "fiery focus stone", "watery focus stone",
									"earthen focus stone", "phantasmal focus stone", "spectral arcane focus stone", "mineral encrusted focus stone",
									"icy focus stone", "brilliant focus stone" };

	String[] arrFocusMidName = { "ashen focus rune", "icy focus rune", "heated focus rune", "vapor focus rune", "dusty focus rune", "brilliant focus rune" };

	String[] arrFocusAlbName =
					{ "heated focus sigil", "icy focus sigil", "ashen focus sigil", "vacuous focus sigil", "earthen focus sigil", "fiery focus sigil",
									"dusty focus sigil", "watery focus sigil", "salt encrusted focus sigil", "vapor focus sigil", "airy focus sigil",
									"brilliant focus sigil" };

	String[] arrResistName = { "dusty shielding jewel", "icy shielding jewel", "heated shielding jewel", "light shielding jewel", "earthen shielding jewel",
					"vapor shielding jewel", "airy shielding jewel", "fiery shielding jewel", "watery shielding jewel" };

	String[] arrStatsName = { "fiery essence jewel", "vapor essence jewel", "airy essence jewel", "earthen essence jewel", "dusty essence jewel",
					"watery essence jewel", "heated essence jewel", "icy essence jewel" };

	String[] arrGemStrength = {
					"Raw", "Uncut", "Rough", "Flawed", "Imperfect", "Polished", "Faceted", "Precious", "Flawless", "Perfect"
	};

	public void newBar ( Realm realm, String character, int gemsNumber, String payload ) {
		var gems = getGems ( realm, gemsNumber, payload );
		if ( gems.isEmpty () ) {
			throw new RuntimeException ( "Gems not found!" );
		}
	}

	private List<Gem> getGems ( Realm realm, int gemsNumber, String payload ) {
		var lines = payload.split ( "\\r?\\n" );
		int gemsFound = 0;
		var gems = new ArrayList<Gem> ();
		for ( var line : lines ) {
			for ( var gemStrength : arrGemStrength ) {
				if ( find ( line, gemStrength ) ) {
					gemsFound++;
					Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, gemStrength );
					gems.add ( getGem ( realm, line, gemStrength ) );
					break;
				}
			}
			if ( gemsFound == gemsNumber ) {
				break;
			}
		}
		if ( gemsFound != gemsNumber ) {
			throw new RuntimeException ( "Gems number provided does not match!" );
		}
		return gems;
	}

	private Gem getGem ( Realm realm, String line, String strength ) {
		for ( var resist : arrResistName ) {
			if ( find ( line, resist ) ) {
				Log.infof ( "Line: \"%s\" contains word: \"%s\"", line, resist );
				return new Gem ( realm, strength, resist );
			}
		}
		return null;
	}

	private boolean find ( String line, String word ) {
		var regex = "\\b" + Pattern.quote ( word ) + "\\b";
		var pattern = Pattern.compile ( regex, Pattern.CASE_INSENSITIVE );
		var matcher = pattern.matcher ( line );
		return matcher.find ();
	}
}
