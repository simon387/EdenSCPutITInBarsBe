package it.simonecelia.edenSCputitinbarsBE.util;

public class GemUtil {

	public static int getId ( String strength, String name ) {
		return switch ( ( strength + " " + name ).toLowerCase () ) {
			case "raw fiery essence jewel" -> 1300000;
			case "uncut fiery essence jewel" -> 1300001;
			default -> 0;
		};
	}
}
