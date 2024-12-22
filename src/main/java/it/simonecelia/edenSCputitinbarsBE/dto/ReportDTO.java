package it.simonecelia.edenSCputitinbarsBE.dto;

import it.simonecelia.edenSCputitinbarsBE.enumeration.Realm;

import java.io.Serial;
import java.io.Serializable;


@SuppressWarnings ( "unused" )
public class ReportDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 2792492376617923690L;

	private Realm realm;

	private String text;

	private String path;

	private String character;

	public Realm getRealm () {
		return realm;
	}

	public void setRealm ( Realm realm ) {
		this.realm = realm;
	}

	public String getText () {
		return text;
	}

	public void setText ( String text ) {
		this.text = text;
	}

	public String getPath () {
		return path;
	}

	public void setPath ( String path ) {
		this.path = path;
	}

	public String getCharacter () {
		return character;
	}

	public void setCharacter ( String character ) {
		this.character = character;
	}
}
