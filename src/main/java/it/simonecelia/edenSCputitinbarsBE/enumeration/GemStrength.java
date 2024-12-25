package it.simonecelia.edenSCputitinbarsBE.enumeration;

import java.util.Arrays;


public enum GemStrength {
	RAW ( "Raw", 0, 1, 1, 1 ),
	UNCUT ( "Uncut", 1, 5, 3, 2 ),
	ROUGH ( "Rough", 2, 10, 5, 4 ),
	FLAWED ( "Flawed", 3, 15, 7, 8 ),
	IMPERFECT ( "Imperfect", 4, 20, 9, 12 ),
	POLISHED ( "Polished", 5, 25, 11, 16 ),
	FACETED ( "Faceted", 6, 30, 13, 20 ),
	PRECIOUS ( "Precious", 7, 35, 15, 24 ),
	FLAWLESS ( "Flawless", 8, 40, 17, 28 ),
	PERFECT ( "Perfect", 9, 45, 19, 32 );

	private final String name;

	private final int level;

	private final int skillImbue;

	private final int statImbue;

	private final int resistImbue;

	GemStrength ( String strength, int level, int skillImbue, int statImbue, int resistImbue ) {
		this.name = strength;
		this.level = level;
		this.skillImbue = skillImbue;
		this.statImbue = statImbue;
		this.resistImbue = resistImbue;
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
