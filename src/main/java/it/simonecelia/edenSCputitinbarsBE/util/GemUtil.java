package it.simonecelia.edenSCputitinbarsBE.util;

import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.model.Gem;

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.BLOOD_ESSENCE_JEWEL;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.MYSTICAL_ESSENCE_JEWEL;


public class GemUtil {

	public static int getId ( Gem gem ) {
		var baseId = getBaseId ( gem );
		var name = gem.getName ().toLowerCase ();
		if ( gem.getRealm () == Realm.MIDGARD && ( name.contains ( BLOOD_ESSENCE_JEWEL ) || ( name.contains ( MYSTICAL_ESSENCE_JEWEL ) ) ) ) {
			baseId += 200;
		}
		if ( gem.getRealm () == Realm.ALBION && name.contains ( BLOOD_ESSENCE_JEWEL ) ) {
			baseId = 1309200;
		}
		if ( gem.getRealm () == Realm.ALBION && name.contains ( MYSTICAL_ESSENCE_JEWEL ) ) {
			baseId = 1309400;
		}
		return baseId + gem.getStrength ().getLevel ();
	}

	private static int getBaseId ( Gem gem ) {
		return switch ( ( gem.getName () ).toLowerCase () ) {
			case "fiery essence jewel" -> 1300000;
			case "earthen essence jewel" -> 1300200;
			case "vapor essence jewel" -> 1300400;
			case "airy essence jewel" -> 1300600;
			case "watery essence jewel" -> 1300800;
			case "heated essence jewel" -> 1301000;
			case "dusty essence jewel" -> 1301200;
			case "icy essence jewel" -> 1301400;
			case "earthen shielding jewel" -> 1301600;
			case "icy shielding jewel" -> 1301800;
			case "heated shielding jewel" -> 1302000;
			case "light shielding jewel" -> 1302200;
			case "airy shielding jewel" -> 1302400;
			case "vapor shielding jewel" -> 1302600;
			case "dusty shielding jewel" -> 1302800;
			case "fiery shielding jewel" -> 1303000;
			case "watery shielding jewel" -> 1303200;
			case "vapor battle jewel" -> 1303400;
			case "fiery battle jewel" -> 1303600;
			case "earthen battle jewel" -> 1303800;
			case "airy battle jewel" -> 1304000;
			case "dusty battle jewel" -> 1304200;
			case "heated battle jewel" -> 1304400;
			case "watery war spell stone" -> 1304600; //errore
			case "fiery war spell stone" -> 1304800;
			case "heated war spell stone" -> 1305200; // dupli
			case "earthen war spell stone" -> 1305400; //tripli
			case "icy war spell stone" -> 1305400; // triplicat
			case "airy war spell stone" -> 1305800; //dupli
			case "fiery nature spell stone" -> 1306000; //dupli
			case "finesse war spell stone" -> 1306200; //dupli
			case "watery nature spell stone" -> 1306400;
			case "finesse nature spell stone" -> 1306600;
			case "earthen nature spell stone" -> 1306800;
			case "airy nature spell stone" -> 1307000;
			case "airy arcane spell stone" -> 1307200;
			case "fiery arcane spell stone" -> 1307400;
			case "watery arcane spell stone" -> 1307600;
			case "vapor arcane spell stone" -> 1307800;
			case "icy arcane spell stone" -> 1308000;
			case "earthen arcane spell stone" -> 1308200;
			case BLOOD_ESSENCE_JEWEL -> 1308400;
			case MYSTICAL_ESSENCE_JEWEL -> 1308600;
			case "fire spell stone" -> 1308800;
			case "water spell stone" -> 1309000;
			case "vapor spell stone" -> 1309200;
			case "ice spell stone" -> 1309400;
			case "earth spell stone" -> 1309600;
			case "light war spell stone" -> 1309800;
			case "steaming nature spell stone" -> 1310000;
			case "oozing nature spell stone" -> 1310200;
			case "mineral encrusted nature spell stone" -> 1310400;
			case "steaming spell stone" -> 1310600;
			case "oozing spell stone" -> 1310800;
			case "mineral encrusted spell stone" -> 1311000;
			case "spectral spell stone" -> 1311200;
			case "phantasmal spell stone" -> 1311400;
			case "ethereal spell stone" -> 1311600;
			case "spectral arcane spell stone" -> 1311800;
			case "phantasmal arcane spell stone" -> 1312000;
			case "ethereal arcane spell stone" -> 1312200;
			case "brilliant spell stone" -> 1312400;
			case "watery war rune" -> 1304600; // dupli
			case "fiery war rune" -> 1304800; // tripli
			case "earthen war rune" -> 1305000;
			case "heated war rune" -> 1305200; //dupli
			case "airy war rune" -> 1305400; //dupli
			case "vapor war rune" -> 1305600;
			case "icy war rune" -> 1305800; //dupli
			case "finesse war rune" -> 1306000; //dupli
			case "earthen primal rune" -> 1306200; //dupli
			case "finesse primal rune" -> 1306400;
			case "airy primal rune" -> 1306600;
			case "fiery primal rune" -> 1306800;
			case "icy chaos rune" -> 1307000;
			case "dusty chaos rune" -> 1307200;
			case "heated chaos rune" -> 1307400;
			case "vapor chaos rune" -> 1307600;
			case "watery chaos rune" -> 1307800;
			case "airy chaos rune" -> 1308000;
			case "fiery chaos rune" -> 1308200;
			case "earthen chaos rune" -> 1308400;
			case "ice rune" -> 1309000;
			case "dust rune" -> 1309200;
			case "heat rune" -> 1309400;
			case "vapor rune" -> 1309600;
			case "lightning charged war" -> 1309800;
			case "ashen primal rune" -> 1310000;
			case "ashen rune" -> 1310200;
			case "brilliant rune" -> 1310600;
			case "watery war sigil" -> 1304600;
			case "fiery war sigil" -> 1304800;
			case "dusty war sigil" -> 1305000;
			case "heated war sigil" -> 1305200;
			case "earthen war sigil" -> 1305400;
			case "airy war sigil" -> 1305600;
			case "vapor war sigil" -> 1305800;
			case "finesse war sigil" -> 1306000;
			case "icy war sigil" -> 1306200;
			case "finesse fervor sigil" -> 1306400;
			case "fiery fervor sigil" -> 1306600;
			case "airy fervor sigil" -> 1306800;
			case "watery fervor sigil" -> 1307000;
			case "earthen fervor sigil" -> 1307200;
			case "vapor fervor sigil" -> 1307400;
			case "earthen evocation sigil" -> 1307600;
			case "icy evocation sigil" -> 1307800;
			case "fiery evocation sigil" -> 1308000;
			case "airy evocation sigil" -> 1308200;
			case "heated evocation sigil" -> 1308400;
			case "dusty evocation sigil" -> 1308600;
			case "vapor evocation sigil" -> 1308800;
			case "watery evocation sigil" -> 1309000;
			case "earth sigil" -> 1309600;
			case "ice sigil" -> 1309800;
			case "fire sigil" -> 1310000;
			case "air sigil" -> 1310200;
			case "heat sigil" -> 1310400;
			case "dust sigil" -> 1310600;
			case "vapor sigil" -> 1310800;
			case "water sigil" -> 1311000;
			case "molten magma war sigil" -> 1311200;
			case "vacuous fervor sigil" -> 1311400;
			case "salt crusted fervor sigil" -> 1311600;
			case "ashen fervor sigil" -> 1311800;
			case "steaming fervor sigil" -> 1312000;
			case "vacuous sigil" -> 1312200;
			case "salt crusted sigil" -> 1312400;
			case "ashen sigil" -> 1312600;
			case "brilliant sigil" -> 1313000;
			default -> 0;
		};
	}

	public static double getImbue ( Gem gem ) {
		return switch ( gem.getType () ) {
		case SKILL -> gem.getStrength ().getSkillValue () * 3;
			case FOCUS -> 1; // lol
			case RESIST -> gem.getStrength ().getResistValue ();
			case STAT -> gem.getStrength ().getStatValue () * 0.33;
			case HITS -> gem.getStrength ().getHitsValue () * 0.2;
		};
	}
}
