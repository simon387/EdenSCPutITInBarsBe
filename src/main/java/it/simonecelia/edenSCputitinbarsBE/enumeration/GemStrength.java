package it.simonecelia.edenSCputitinbarsBE.enumeration;

import java.util.Arrays;


@SuppressWarnings ( "unused" )
public enum GemStrength {
	RAW ( 0, 1, 1, 1, 1, 1, 1, 4 ),
	UNCUT ( 1, 5, 2, 2, 2, 3, 4, 12 ),
	ROUGH ( 2, 10, 3, 4, 3, 5, 7, 20 ),
	FLAWED ( 3, 15, 4, 8, 5, 7, 10, 28 ),
	IMPERFECT ( 4, 20, 5, 12, 7, 9, 13, 36 ),
	POLISHED ( 5, 25, 6, 16, 9, 11, 16, 44 ),
	FACETED ( 6, 30, 7, 20, 11, 13, 19, 52 ),
	PRECIOUS ( 7, 35, 8, 24, 13, 15, 22, 60 ),
	FLAWLESS ( 8, 40, 9, 28, 15, 17, 25, 68 ),
	PERFECT ( 9, 45, 10, 32, 17, 19, 28, 76 );

	private final String name;

	private final int level;

	private final int skillImbue;

	private final int statImbue;

	private final int resistImbue;

	private final int statValue;

	private final int resistValue;

	private final int skillValue;

	private final int hitsValue;

	GemStrength ( int level, int skillImbue, int skillValue, int resistImbue, int resistValue, int statImbue, int statValue, int hitsValue ) {
		this.name = this.name ().toLowerCase ();
		this.level = level;
		this.skillImbue = skillImbue;
		this.statImbue = statImbue;
		this.resistImbue = resistImbue;
		this.statValue = statValue;
		this.resistValue = resistValue;
		this.skillValue = skillValue;
		this.hitsValue = hitsValue;
	}

	public static String[] getArray () {
		return Arrays.stream ( GemStrength.values () )
						.map ( GemStrength::getName )
						.toArray ( String[]::new );
	}

	public static GemStrength fromName ( String name ) {
		return Arrays.stream ( GemStrength.values () )
						.filter ( gs -> gs.getName ().equalsIgnoreCase ( name ) )
						.findFirst ()
						.orElseThrow ( () -> new IllegalArgumentException ( "No enum constant for strength: " + name ) );
	}

	public String getName () {
		return name;
	}

	public int getLevel () {
		return level;
	}

	public int getSkillImbue () {
		return skillImbue;
	}

	public int getStatImbue () {
		return statImbue;
	}

	public int getResistImbue () {
		return resistImbue;
	}

	public int getStatValue () {
		return statValue;
	}

	public int getResistValue () {
		return resistValue;
	}

	public int getSkillValue () {
		return skillValue;
	}

	public int getHitsValue () {
		return hitsValue;
	}
}
