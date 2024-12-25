package it.simonecelia.edenSCputitinbarsBE.enumeration;

import java.util.Arrays;

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusAlb;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusHib;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.focusMid;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.hits;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.resist;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsAlb;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsHib;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.skillsMid;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.stats;


public enum GemType {
	SKILL,
	FOCUS,
	RESIST,
	STAT,
	HITS;

	public static GemType fromName ( String name ) {
		if ( Arrays.asList ( skillsMid ).contains ( name ) || Arrays.asList ( skillsHib ).contains ( name ) || Arrays.asList ( skillsAlb ).contains ( name ) ) {
			return SKILL;
		}
		if ( Arrays.asList ( focusHib ).contains ( name ) || Arrays.asList ( focusMid ).contains ( name ) || Arrays.asList ( focusAlb ).contains ( name ) ) {
			return FOCUS;
		}
		if ( Arrays.asList ( resist ).contains ( name ) ) {
			return RESIST;
		}
		if ( Arrays.asList ( stats ).contains ( name ) ) {
			return STAT;
		}
		if ( hits[0].equalsIgnoreCase ( name ) ) {
			return HITS;
		}
		return null;
	}
}
