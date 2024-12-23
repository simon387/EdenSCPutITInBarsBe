package it.simonecelia.edenSCputitinbarsBE.util;

public class GemUtil {

	public static int getId ( String strength, String name ) {
		return switch ( ( strength + " " + name ).toLowerCase () ) {
			case "raw fiery essence jewel" -> 1300000;
			case "uncut fiery essence jewel" -> 1300001;
			case "rough fiery essence jewel" -> 1300002;
			case "flawed fiery essence jewel" -> 1300003;
			case "imperfect fiery essence jewel" -> 1300004;
			case "polished fiery essence jewel" -> 1300005;
			case "faceted fiery essence jewel" -> 1300006;
			case "precious fiery essence jewel" -> 1300007;
			case "flawless fiery essence jewel" -> 1300008;
			case "perfect fiery essence jewel" -> 1300009;
			default -> 0;
		};
	}
}
