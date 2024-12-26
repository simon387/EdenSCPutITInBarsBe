package it.simonecelia.edenSCputitinbarsBE.model;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemType;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;


public class Gem extends GemData {

	private final Realm realm;

	private final GemStrength strength;

	private final String name;

	private final int id;

	private final GemType type;

	private final double imbue;

	public Gem ( Realm realm, String strength, String name ) {
		this.realm = realm;
		this.strength = GemStrength.fromName ( strength );
		this.name = name;
		this.id = calcId ( this );
		this.type = GemType.fromName ( name );
		this.imbue = calcImbue ( this );
		Log.infof ( "Created Gem: %s", this );
	}

	private int calcId ( Gem gem ) {
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

	private int getBaseId ( Gem gem ) {
		return switch ( ( gem.getName () ).toLowerCase () ) {
			case FIERY_ESSENCE_JEWEL -> 1300000;
			case EARTHEN_ESSENCE_JEWEL -> 1300200;
			case VAPOR_ESSENCE_JEWEL -> 1300400;
			case AIRY_ESSENCE_JEWEL -> 1300600;
			case WATERY_ESSENCE_JEWEL -> 1300800;
			case HEATED_ESSENCE_JEWEL -> 1301000;
			case DUSTY_ESSENCE_JEWEL -> 1301200;
			case ICY_ESSENCE_JEWEL -> 1301400;
			case EARTHEN_SHIELDING_JEWEL -> 1301600;
			case ICY_SHIELDING_JEWEL -> 1301800;
			case HEATED_SHIELDING_JEWEL -> 1302000;
			case LIGHT_SHIELDING_JEWEL -> 1302200;
			case AIRY_SHIELDING_JEWEL -> 1302400;
			case VAPOR_SHIELDING_JEWEL -> 1302600;
			case DUSTY_SHIELDING_JEWEL -> 1302800;
			case FIERY_SHIELDING_JEWEL -> 1303000;
			case WATERY_SHIELDING_JEWEL -> 1303200;
			case VAPOR_BATTLE_JEWEL -> 1303400;
			case FIERY_BATTLE_JEWEL -> 1303600;
			case EARTHEN_BATTLE_JEWEL -> 1303800;
			case AIRY_BATTLE_JEWEL -> 1304000;
			case DUSTY_BATTLE_JEWEL -> 1304200;
			case HEATED_BATTLE_JEWEL -> 1304400;
			case WATERY_WAR_SPELL_STONE -> 1304600;
			case FIERY_WAR_SPELL_STONE -> 1304800;
			case HEATED_WAR_SPELL_STONE -> 1305200;
			case EARTHEN_WAR_SPELL_STONE -> 1305400;
			case AIRY_WAR_SPELL_STONE -> 1305800;
			case FIERY_NATURE_SPELL_STONE -> 1306000;
			case FINESSE_WAR_SPELL_STONE -> 1306200;
			case ICY_WAR_SPELL_STONE -> 1305400;
			case FINESSE_NATURE_SPELL_STONE -> 1306600;
			case WATERY_NATURE_SPELL_STONE -> 1306400;
			case AIRY_NATURE_SPELL_STONE -> 1307000;
			case EARTHEN_NATURE_SPELL_STONE -> 1306800;
			case FIERY_ARCANE_SPELL_STONE -> 1307400;
			case AIRY_ARCANE_SPELL_STONE -> 1307200;
			case VAPOR_ARCANE_SPELL_STONE -> 1307800;
			case WATERY_ARCANE_SPELL_STONE -> 1307600;
			case ICY_ARCANE_SPELL_STONE -> 1308000;
			case EARTHEN_ARCANE_SPELL_STONE -> 1308200;
			case BLOOD_ESSENCE_JEWEL -> 1308400;
			case MYSTICAL_ESSENCE_JEWEL -> 1308600;
			case FIRE_SPELL_STONE -> 1308800;
			case WATER_SPELL_STONE -> 1309000;
			case VAPOR_SPELL_STONE -> 1309200;
			case ICE_SPELL_STONE -> 1309400;
			case EARTH_SPELL_STONE -> 1309600;
			case LIGHT_WAR_SPELL_STONE -> 1309800;
			case STEAMING_NATURE_SPELL_STONE -> 1310000;
			case OOZING_NATURE_SPELL_STONE -> 1310200;
			case MINERAL_ENCRUSTED_NATURE_SPELL_STONE -> 1310400;
			case STEAMING_SPELL_STONE -> 1310600;
			case OOZING_SPELL_STONE -> 1310800;
			case MINERAL_ENCRUSTED_SPELL_STONE -> 1311000;
			case SPECTRAL_SPELL_STONE -> 1311200;
			case PHANTASMAL_SPELL_STONE -> 1311400;
			case ETHEREAL_SPELL_STONE -> 1311600;
			case SPECTRAL_ARCANE_SPELL_STONE -> 1311800;
			case PHANTASMAL_ARCANE_SPELL_STONE -> 1312000;
			case EARTHEN_WAR_RUNE -> 1305000;
			case ETHEREAL_ARCANE_SPELL_STONE -> 1312200;
			case BRILLIANT_SPELL_STONE -> 1312400;
			case FIERY_WAR_RUNE -> 1304800;
			case WATERY_WAR_RUNE -> 1304600;
			case AIRY_WAR_RUNE -> 1305400;
			case HEATED_WAR_RUNE -> 1305200;
			case VAPOR_WAR_RUNE -> 1305600;
			case FINESSE_WAR_RUNE -> 1306000;
			case ICY_WAR_RUNE -> 1305800;
			case EARTHEN_PRIMAL_RUNE -> 1306200;
			case AIRY_PRIMAL_RUNE -> 1306600;
			case FINESSE_PRIMAL_RUNE -> 1306400;
			case FIERY_PRIMAL_RUNE -> 1306800;
			case DUSTY_CHAOS_RUNE -> 1307200;
			case ICY_CHAOS_RUNE -> 1307000;
			case HEATED_CHAOS_RUNE -> 1307400;
			case VAPOR_CHAOS_RUNE -> 1307600;
			case WATERY_CHAOS_RUNE -> 1307800;
			case AIRY_CHAOS_RUNE -> 1308000;
			case FIERY_CHAOS_RUNE -> 1308200;
			case EARTHEN_CHAOS_RUNE -> 1308400;
			case DUST_RUNE -> 1309200;
			case ICE_RUNE -> 1309000;
			case HEAT_RUNE -> 1309400;
			case VAPOR_RUNE -> 1309600;
			case LIGHTNING_CHARGED_WAR -> 1309800;
			case ASHEN_PRIMAL_RUNE -> 1310000;
			case ASHEN_RUNE -> 1310200;
			case BRILLIANT_RUNE -> 1310600;
			case WATERY_WAR_SIGIL -> 1304600;
			case FIERY_WAR_SIGIL -> 1304800;
			case DUSTY_WAR_SIGIL -> 1305000;
			case HEATED_WAR_SIGIL -> 1305200;
			case EARTHEN_WAR_SIGIL -> 1305400;
			case AIRY_WAR_SIGIL -> 1305600;
			case VAPOR_WAR_SIGIL -> 1305800;
			case FINESSE_WAR_SIGIL -> 1306000;
			case ICY_WAR_SIGIL -> 1306200;
			case FINESSE_FERVOR_SIGIL -> 1306400;
			case FIERY_FERVOR_SIGIL -> 1306600;
			case AIRY_FERVOR_SIGIL -> 1306800;
			case WATERY_FERVOR_SIGIL -> 1307000;
			case EARTHEN_FERVOR_SIGIL -> 1307200;
			case VAPOR_FERVOR_SIGIL -> 1307400;
			case EARTHEN_EVOCATION_SIGIL -> 1307600;
			case ICY_EVOCATION_SIGIL -> 1307800;
			case FIERY_EVOCATION_SIGIL -> 1308000;
			case AIRY_EVOCATION_SIGIL -> 1308200;
			case HEATED_EVOCATION_SIGIL -> 1308400;
			case DUSTY_EVOCATION_SIGIL -> 1308600;
			case VAPOR_EVOCATION_SIGIL -> 1308800;
			case WATERY_EVOCATION_SIGIL -> 1309000;
			case ICE_SIGIL -> 1309800;
			case EARTH_SIGIL -> 1309600;
			case FIRE_SIGIL -> 1310000;
			case AIR_SIGIL -> 1310200;
			case HEAT_SIGIL -> 1310400;
			case DUST_SIGIL -> 1310600;
			case VAPOR_SIGIL -> 1310800;
			case WATER_SIGIL -> 1311000;
			case VACUOUS_SIGIL -> 1312200;
			case SALT_CRUSTED_FERVOR_SIGIL -> 1311600;
			case SALT_CRUSTED_SIGIL -> 1312400;
			case ASHEN_SIGIL -> 1312600;
			case BRILLIANT_SIGIL -> 1313000;
			case MOLTEN_MAGMA_WAR_SIGIL -> 1311200;
			case VACUOUS_FERVOR_SIGIL -> 1311400;
			case STEAMING_FERVOR_SIGIL -> 1312000;
			case ASHEN_FERVOR_SIGIL -> 1311800;
			default -> 0;
		};
	}

	private double calcImbue ( Gem gem ) {
		return switch ( gem.getType () ) {
			case SKILL_ALB, SKILL_HIB, SKILL_MID, SKILL_ALL -> gem.getStrength ().getSkillValue () * 3;
			case FOCUS_ALB, FOCUS_HIB, FOCUS_MID, UNSET -> 1; // lol
			case RESIST -> gem.getStrength ().getResistValue ();
			case STAT -> gem.getStrength ().getStatValue () * 0.33;
			case HITS -> gem.getStrength ().getHitsValue () * 0.2;
		};
	}

	public Realm getRealm () {
		return realm;
	}

	public GemStrength getStrength () {
		return strength;
	}

	public String getName () {
		return name;
	}

	public int getId () {
		return id;
	}

	public GemType getType () {
		return type;
	}

	public double getImbue () {
		return imbue;
	}

	@Override
	public String toString () {
		return "Gem{" +
						"realm=" + realm +
						", strength=" + strength +
						", name='" + name + '\'' +
						", id=" + id +
						", type=" + type +
						", imbue=" + imbue +
						'}';
	}
}
