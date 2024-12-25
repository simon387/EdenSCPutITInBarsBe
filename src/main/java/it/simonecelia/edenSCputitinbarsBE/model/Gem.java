package it.simonecelia.edenSCputitinbarsBE.model;

import it.simonecelia.edenSCputitinbarsBE.enumeration.GemStrength;
import it.simonecelia.edenSCputitinbarsBE.enumeration.GemType;
import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.util.GemUtil;


public class Gem {

	private final Realm realm;

	private final GemStrength strength;

	private final String name;

	private final int id;

	private final GemType type;

	private final int imbue;

	public Gem ( Realm realm, String strength, String name ) {
		this.realm = realm;
		this.strength = GemStrength.fromName ( strength );
		this.name = name;
		this.id = GemUtil.getId ( this );
		this.type = GemType.fromName ( name );
		this.imbue = GemUtil.getImbue ( this );
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

	public int getImbue () {
		return imbue;
	}
}
