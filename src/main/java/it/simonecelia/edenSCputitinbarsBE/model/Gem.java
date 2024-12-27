package it.simonecelia.edenSCputitinbarsBE.model;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemType;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Gems;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;

import static it.simonecelia.edenSCputitinbarsBE.enumeration.Gems.BLOOD_ESSENCE_JEWEL;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.Gems.MYSTICAL_ESSENCE_JEWEL;


public class Gem {

	private final Realm realm;

	private final GemStrength strength;

	private final String name;

	private final int id;

	private final GemType type;

	private final double imbue;

	public Gem ( Realm realm, String strength, Gems gem ) {
		this.realm = realm;
		this.strength = GemStrength.fromName ( strength );
		this.name = gem.getName ();
		this.id = calcId ( gem, this );
		this.type = gem.getType ();
		this.imbue = calcImbue ( this );
		Log.infof ( "Created Gem: %s", this );
	}

	private int calcId ( Gems gem, Gem gemma ) {
		var baseId = gem.getBaseId ();
		if ( null == baseId ) {
			throw new RuntimeException ( "Gems base id is null!" );
		}
		if ( gemma.getRealm () == Realm.MIDGARD && ( gem.equals ( BLOOD_ESSENCE_JEWEL ) || ( gem.equals ( MYSTICAL_ESSENCE_JEWEL ) ) ) ) {
			baseId += 200;
		}
		if ( gemma.getRealm () == Realm.ALBION && gem.equals ( BLOOD_ESSENCE_JEWEL ) ) {
			baseId = 1309200;
		}
		if ( gemma.getRealm () == Realm.ALBION && gem.equals ( MYSTICAL_ESSENCE_JEWEL ) ) {
			baseId = 1309400;
		}
		return baseId + gemma.getStrength ().getLevel ();
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
