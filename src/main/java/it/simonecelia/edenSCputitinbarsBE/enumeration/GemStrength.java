package it.simonecelia.edenSCputitinbarsBE.enumeration;

import java.util.Arrays;


public enum GemStrength {
	RAW ( "Raw", 0 ),
	UNCUT ( "Uncut", 1 ),
	ROUGH ( "Rough", 2 ),
	FLAWED ( "Flawed", 3 ),
	IMPERFECT ( "Imperfect", 4 ),
	POLISHED ( "Polished", 5 ),
	FACETED ( "Faceted", 6 ),
	PRECIOUS ( "Precious", 7 ),
	FLAWLESS ( "Flawless", 8 ),
	PERFECT ( "Perfect", 9 );

	private final String strength;

	private final int level;

	GemStrength ( String strength, int level ) {
		this.strength = strength;
		this.level = level;
	}

	public String getStrength () {
		return strength;
	}

	public String getStrengthLowerCase () {
		return strength.toLowerCase ();
	}

	public int getLevel () {
		return level;
	}

	public static String[] getArray () {
		return Arrays.stream ( GemStrength.values () )
						.map ( GemStrength::getStrength )
						.toArray ( String[]::new );
	}

	public static GemStrength fromStrength ( String strength ) {
		return Arrays.stream ( GemStrength.values () )
						.filter ( gs -> gs.getStrength ().equalsIgnoreCase ( strength ) )
						.findFirst ()
						.orElseThrow ( () -> new IllegalArgumentException ( "No enum constant for strength: " + strength ) );
	}
}
