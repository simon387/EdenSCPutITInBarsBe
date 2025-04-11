package it.simonecelia.edenSCputitinbarsBE.model;

import io.quarkus.logging.Log;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Gem;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;

import static it.simonecelia.edenSCputitinbarsBE.enumeration.Gem.BLOOD_ESSENCE_JEWEL;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.Gem.MYSTICAL_ESSENCE_JEWEL;


public class GemModel {

	private final Realm realm;

	private final GemStrength strength;

	private final int id;

	private final double imbue;

	private final Gem gem;

	public GemModel () {
		this.realm = null;
		this.strength = null;
		this.id = 0;
		this.imbue = 0;
		this.gem = null;
	}

	public GemModel ( Realm realm, String strength, Gem gem ) {
		this.realm = realm;
		this.strength = GemStrength.fromName ( strength );
		this.gem = gem;
		this.id = calcId ( gem );
		this.imbue = calcImbue ( this );
		Log.infof ( "Created GemModel: %s", this );
	}

	private int calcId ( Gem gem ) {
		var baseId = gem.getBaseId ();
		if ( null == baseId ) {
			throw new RuntimeException ( "Gem base id is null!" );
		}
		if ( this.getRealm () == Realm.MIDGARD && ( gem.equals ( BLOOD_ESSENCE_JEWEL ) || ( gem.equals ( MYSTICAL_ESSENCE_JEWEL ) ) ) ) {
			baseId += 200;
		}
		if ( this.getRealm () == Realm.ALBION && gem.equals ( BLOOD_ESSENCE_JEWEL ) ) {
			baseId = 1309200;
		}
		if ( this.getRealm () == Realm.ALBION && gem.equals ( MYSTICAL_ESSENCE_JEWEL ) ) {
			baseId = 1309400;
		}
		return baseId + this.getStrength ().getLevel ();
	}

	private double calcImbue ( GemModel gemModel ) {
		return switch ( gemModel.getGem ().getType () ) {
			case SKILL_ALB, SKILL_HIB, SKILL_MID, SKILL_ALL -> gemModel.getStrength ().getSkillValue () * 3;
			case FOCUS_ALB, FOCUS_HIB, FOCUS_MID, UNSET -> 1; // lol
			case RESIST -> gemModel.getStrength ().getResistValue ();
			case STAT -> gemModel.getStrength ().getStatValue () * 0.33;
			case HITS -> gemModel.getStrength ().getHitsValue () * 0.2;
		};
	}

	public Realm getRealm () {
		return realm;
	}

	public GemStrength getStrength () {
		return strength;
	}

	public Gem getGem () {
		return gem;
	}

	public int getId () {
		return id;
	}

	public double getImbue () {
		return imbue;
	}

	@Override public String toString () {
		return "GemModel{" +
						"realm=" + realm +
						", strength=" + strength +
						", id=" + id +
						", imbue=" + imbue +
						", gem=" + gem +
						'}';
	}
}
