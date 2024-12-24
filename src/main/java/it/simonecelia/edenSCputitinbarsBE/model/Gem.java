package it.simonecelia.edenSCputitinbarsBE.model;

import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;
import it.simonecelia.edenSCputitinbarsBE.util.GemUtil;


@SuppressWarnings ( "unused" )
public class Gem {

	private Realm realm;

	private String strength;

	private String name;

	private int id;

	public Gem ( Realm realm, String strength, String name ) {
		this.realm = realm;
		this.strength = strength;
		this.name = name;
		this.id = GemUtil.getId ( strength, name, realm );
	}

	public Realm getRealm () {
		return realm;
	}

	public void setRealm ( Realm realm ) {
		this.realm = realm;
	}

	public String getStrength () {
		return strength;
	}

	public void setStrength ( String strength ) {
		this.strength = strength;
	}

	public String getName () {
		return name;
	}

	public void setName ( String name ) {
		this.name = name;
	}

	public int getId () {
		return id;
	}

	public void setId ( int id ) {
		this.id = id;
	}
}
