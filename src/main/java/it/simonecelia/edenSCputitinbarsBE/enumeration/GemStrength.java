package it.simonecelia.edenSCputitinbarsBE.enumeration;

import java.util.Arrays;


@SuppressWarnings ( "unused" )
public enum GemStrength {
	RAW ( 0, 1, 1, 1, 1, 1, 1, 4 ),
	UNCUT ( 1, 5, 3, 2, 4, 2, 2, 12 ),
	ROUGH ( 2, 10, 5, 4, 7, 3, 3, 20 ),
	FLAWED ( 3, 15, 7, 8, 10, 5, 4, 28 ),
	IMPERFECT ( 4, 20, 9, 12, 13, 7, 5, 36 ),
	POLISHED ( 5, 25, 11, 16, 16, 9, 6, 44 ),
	FACETED ( 6, 30, 13, 20, 19, 11, 7, 52 ),
	PRECIOUS ( 7, 35, 15, 24, 22, 13, 8, 60 ),
	FLAWLESS ( 8, 40, 17, 28, 25, 15, 9, 68 ),
	PERFECT ( 9, 45, 19, 32, 28, 17, 10, 76 );

	private final String name;

	private final int level;

	private final int skillImbue;

	private final int statImbue;

	private final int resistImbue;

	private final int statValue;

	private final int resistValue;

	private final int skillValue;

	private final int hitsValue;

	GemStrength ( int level, int skillImbue, int statImbue, int resistImbue, int statValue, int resistValue, int skillValue, int hitsValue ) {
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
}
