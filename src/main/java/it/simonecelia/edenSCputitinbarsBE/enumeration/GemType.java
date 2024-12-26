package it.simonecelia.edenSCputitinbarsBE.enumeration;

import it.simonecelia.edenSCputitinbarsBE.model.GemData;

import java.util.Arrays;

import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.FOCUSES_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.SKILLS_MID;
import static it.simonecelia.edenSCputitinbarsBE.model.GemData.STATS;


public enum GemType {
	SKILL_ALB,
	SKILL_HIB,
	SKILL_MID,
	SKILL_ALL,
	FOCUS_ALB,
	FOCUS_HIB,
	FOCUS_MID,
	RESIST,
	STAT,
	HITS,
	UNSET;

	public static GemType fromName ( String name ) {
		if ( Arrays.asList ( SKILLS_ALB ).contains ( name ) ) {
			return SKILL_ALB;
		}
		if ( Arrays.asList ( FOCUSES_ALB ).contains ( name )  ) {
			return FOCUS_ALB;
		}
		if ( Arrays.asList ( SKILLS_HIB ).contains ( name ) ) {
			return SKILL_HIB;
		}
		if ( Arrays.asList ( FOCUSES_HIB ).contains ( name )  ) {
			return FOCUS_HIB;
		}
		if ( Arrays.asList ( SKILLS_MID ).contains ( name ) ) {
			return SKILL_MID;
		}
		if ( Arrays.asList ( FOCUSES_MID ).contains ( name )  ) {
			return FOCUS_MID;
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
