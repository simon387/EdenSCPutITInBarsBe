package it.simonecelia.edenSCputitinbarsBE.enumeration;

import it.simonecelia.edenSCputitinbarsBE.model.GemData;

import java.util.Arrays;

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUS_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.STATS;


public enum GemType {
	SKILL,
	FOCUS,
	RESIST,
	STAT,
	HITS;

	public static GemType fromName ( String name ) {
		if ( Arrays.asList ( SKILLS_MID ).contains ( name ) || Arrays.asList ( SKILLS_HIB ).contains ( name ) || Arrays.asList ( SKILLS_ALB ).contains ( name ) ) {
			return SKILL;
		}
		if ( Arrays.asList ( FOCUS_HIB ).contains ( name ) || Arrays.asList ( FOCUS_MID ).contains ( name ) || Arrays.asList ( FOCUS_ALB ).contains ( name ) ) {
			return FOCUS;
		}
		if ( Arrays.asList ( GemData.RESISTS ).contains ( name ) ) {
			return RESIST;
		}
		if ( Arrays.asList ( STATS ).contains ( name ) ) {
			return STAT;
		}
		if ( GemData.HITS[0].equalsIgnoreCase ( name ) ) {
			return HITS;
		}
		return null;
	}
}
