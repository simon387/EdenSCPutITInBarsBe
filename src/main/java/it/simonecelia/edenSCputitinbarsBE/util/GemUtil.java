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
			case "raw earthen essence jewel" -> 1300200;
			case "uncut earthen essence jewel" -> 1300201;
			case "rough earthen essence jewel" -> 1300202;
			case "flawed earthen essence jewel" -> 1300203;
			case "imperfect earthen essence jewel" -> 1300204;
			case "polished earthen essence jewel" -> 1300205;
			case "faceted earthen essence jewel" -> 1300206;
			case "precious earthen essence jewel" -> 1300207;
			case "flawless earthen essence jewel" -> 1300208;
			case "perfect earthen essence jewel" -> 1300209;
			case "raw vapor essence jewel" -> 1300400;
			case "uncut vapor essence jewel" -> 1300401;
			case "rough vapor essence jewel" -> 1300402;
			case "flawed vapor essence jewel" -> 1300403;
			case "imperfect vapor essence jewel" -> 1300404;
			case "polished vapor essence jewel" -> 1300405;
			case "faceted vapor essence jewel" -> 1300406;
			case "precious vapor essence jewel" -> 1300407;
			case "flawless vapor essence jewel" -> 1300408;
			case "perfect vapor essence jewel" -> 1300409;
			case "raw airy essence jewel" -> 1300600;
			case "uncut airy essence jewel" -> 1300601;
			case "rough airy essence jewel" -> 1300602;
			case "flawed airy essence jewel" -> 1300603;
			case "imperfect airy essence jewel" -> 1300604;
			case "polished airy essence jewel" -> 1300605;
			case "faceted airy essence jewel" -> 1300606;
			case "precious airy essence jewel" -> 1300607;
			case "flawless airy essence jewel" -> 1300608;
			case "perfect airy essence jewel" -> 1300609;
			case "raw watery essence jewel" -> 1300800;
			case "uncut watery essence jewel" -> 1300801;
			case "rough watery essence jewel" -> 1300802;
			case "flawed watery essence jewel" -> 1300803;
			case "imperfect watery essence jewel" -> 1300804;
			case "polished watery essence jewel" -> 1300805;
			case "faceted watery essence jewel" -> 1300806;
			case "precious watery essence jewel" -> 1300807;
			case "flawless watery essence jewel" -> 1300808;
			case "perfect watery essence jewel" -> 1300809;
			case "raw heated essence jewel" -> 1301000;
			case "uncut heated essence jewel" -> 1301001;
			case "rough heated essence jewel" -> 1301002;
			case "flawed heated essence jewel" -> 1301003;
			case "imperfect heated essence jewel" -> 1301004;
			case "polished heated essence jewel" -> 1301005;
			case "faceted heated essence jewel" -> 1301006;
			case "precious heated essence jewel" -> 1301007;
			case "flawless heated essence jewel" -> 1301008;
			case "perfect heated essence jewel" -> 1301009;

			default -> 0;
		};
	}
}
