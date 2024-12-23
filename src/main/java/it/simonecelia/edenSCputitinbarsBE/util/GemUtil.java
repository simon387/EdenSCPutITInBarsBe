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
			case "raw dusty essence jewel" -> 1301200;
			case "uncut dusty essence jewel" -> 1301201;
			case "rough dusty essence jewel" -> 1301202;
			case "flawed dusty essence jewel" -> 1301203;
			case "imperfect dusty essence jewel" -> 1301204;
			case "polished dusty essence jewel" -> 1301205;
			case "faceted dusty essence jewel" -> 1301206;
			case "precious dusty essence jewel" -> 1301207;
			case "flawless dusty essence jewel" -> 1301208;
			case "perfect dusty essence jewel" -> 1301209;
			case "raw icy essence jewel" -> 1301400;
			case "uncut icy essence jewel" -> 1301401;
			case "rough icy essence jewel" -> 1301402;
			case "flawed icy essence jewel" -> 1301403;
			case "imperfect icy essence jewel" -> 1301404;
			case "polished icy essence jewel" -> 1301405;
			case "faceted icy essence jewel" -> 1301406;
			case "precious icy essence jewel" -> 1301407;
			case "flawless icy essence jewel" -> 1301408;
			case "perfect icy essence jewel" -> 1301409;
			case "raw earthen shielding jewel" -> 1301600;
			case "uncut earthen shielding jewel" -> 1301601;
			case "rough earthen shielding jewel" -> 1301602;
			case "flawed earthen shielding jewel" -> 1301603;
			case "imperfect earthen shielding jewel" -> 1301604;
			case "polished earthen shielding jewel" -> 1301605;
			case "faceted earthen shielding jewel" -> 1301606;
			case "precious earthen shielding jewel" -> 1301607;
			case "flawless earthen shielding jewel" -> 1301608;
			case "perfect earthen shielding jewel" -> 1301609;
			case "raw icy shielding jewel" -> 1301800;
			case "uncut icy shielding jewel" -> 1301801;
			case "rough icy shielding jewel" -> 1301802;
			case "flawed icy shielding jewel" -> 1301803;
			case "imperfect icy shielding jewel" -> 1301804;
			case "polished icy shielding jewel" -> 1301805;
			case "faceted icy shielding jewel" -> 1301806;
			case "precious icy shielding jewel" -> 1301807;
			case "flawless icy shielding jewel" -> 1301808;
			case "perfect icy shielding jewel" -> 1301809;
			case "raw heated shielding jewel" -> 1302000;
			case "uncut heated shielding jewel" -> 1302001;
			case "rough heated shielding jewel" -> 1302002;
			case "flawed heated shielding jewel" -> 1302003;
			case "imperfect heated shielding jewel" -> 1302004;
			case "polished heated shielding jewel" -> 1302005;
			case "faceted heated shielding jewel" -> 1302006;
			case "precious heated shielding jewel" -> 1302007;
			case "flawless heated shielding jewel" -> 1302008;
			case "perfect heated shielding jewel" -> 1302009;
			case "raw light shielding jewel" -> 1302200;
			case "uncut light shielding jewel" -> 1302201;
			case "rough light shielding jewel" -> 1302202;
			case "flawed light shielding jewel" -> 1302203;
			case "imperfect light shielding jewel" -> 1302204;
			case "polished light shielding jewel" -> 1302205;
			case "faceted light shielding jewel" -> 1302206;
			case "precious light shielding jewel" -> 1302207;
			case "flawless light shielding jewel" -> 1302208;
			case "perfect light shielding jewel" -> 1302209;
			case "raw airy shielding jewel" -> 1302400;
			case "uncut airy shielding jewel" -> 1302401;
			case "rough airy shielding jewel" -> 1302402;
			case "flawed airy shielding jewel" -> 1302403;
			case "imperfect airy shielding jewel" -> 1302404;
			case "polished airy shielding jewel" -> 1302405;
			case "faceted airy shielding jewel" -> 1302406;
			case "precious airy shielding jewel" -> 1302407;
			case "flawless airy shielding jewel" -> 1302408;
			case "perfect airy shielding jewel" -> 1302409;
			case "raw vapor shielding jewel" -> 1302600;
			case "uncut vapor shielding jewel" -> 1302601;
			case "rough vapor shielding jewel" -> 1302602;
			case "flawed vapor shielding jewel" -> 1302603;
			case "imperfect vapor shielding jewel" -> 1302604;
			case "polished vapor shielding jewel" -> 1302605;
			case "faceted vapor shielding jewel" -> 1302606;
			case "precious vapor shielding jewel" -> 1302607;
			case "flawless vapor shielding jewel" -> 1302608;
			case "perfect vapor shielding jewel" -> 1302609;
			case "raw dusty shielding jewel" -> 1302800;
			case "uncut dusty shielding jewel" -> 1302801;
			case "rough dusty shielding jewel" -> 1302802;
			case "flawed dusty shielding jewel" -> 1302803;
			case "imperfect dusty shielding jewel" -> 1302804;
			case "polished dusty shielding jewel" -> 1302805;
			case "faceted dusty shielding jewel" -> 1302806;
			case "precious dusty shielding jewel" -> 1302807;
			case "flawless dusty shielding jewel" -> 1302808;
			case "perfect dusty shielding jewel" -> 1302809;
			case "raw fiery shielding jewel" -> 1303000;
			case "uncut fiery shielding jewel" -> 1303001;
			case "rough fiery shielding jewel" -> 1303002;
			case "flawed fiery shielding jewel" -> 1303003;
			case "imperfect fiery shielding jewel" -> 1303004;
			case "polished fiery shielding jewel" -> 1303005;
			case "faceted fiery shielding jewel" -> 1303006;
			case "precious fiery shielding jewel" -> 1303007;
			case "flawless fiery shielding jewel" -> 1303008;
			case "perfect fiery shielding jewel" -> 1303009;
			case "raw watery shielding jewel" -> 1303200;
			case "uncut watery shielding jewel" -> 1303201;
			case "rough watery shielding jewel" -> 1303202;
			case "flawed watery shielding jewel" -> 1303203;
			case "imperfect watery shielding jewel" -> 1303204;
			case "polished watery shielding jewel" -> 1303205;
			case "faceted watery shielding jewel" -> 1303206;
			case "precious watery shielding jewel" -> 1303207;
			case "flawless watery shielding jewel" -> 1303208;
			case "perfect watery shielding jewel" -> 1303209;
			case "raw vapor battle jewel" -> 1303400;
			case "uncut vapor battle jewel" -> 1303401;
			case "rough vapor battle jewel" -> 1303402;
			case "flawed vapor battle jewel" -> 1303403;
			case "imperfect vapor battle jewel" -> 1303404;
			case "polished vapor battle jewel" -> 1303405;
			case "faceted vapor battle jewel" -> 1303406;
			case "precious vapor battle jewel" -> 1303407;
			case "flawless vapor battle jewel" -> 1303408;
			case "perfect vapor battle jewel" -> 1303409;
			case "raw fiery battle jewel" -> 1303600;
			case "uncut fiery battle jewel" -> 1303601;
			case "rough fiery battle jewel" -> 1303602;
			case "flawed fiery battle jewel" -> 1303603;
			case "imperfect fiery battle jewel" -> 1303604;
			case "polished fiery battle jewel" -> 1303605;
			case "faceted fiery battle jewel" -> 1303606;
			case "precious fiery battle jewel" -> 1303607;
			case "flawless fiery battle jewel" -> 1303608;
			case "perfect fiery battle jewel" -> 1303609;
			case "raw earthen battle jewel" -> 1303800;
			case "uncut earthen battle jewel" -> 1303801;
			case "rough earthen battle jewel" -> 1303802;
			case "flawed earthen battle jewel" -> 1303803;
			case "imperfect earthen battle jewel" -> 1303804;
			case "polished earthen battle jewel" -> 1303805;
			case "faceted earthen battle jewel" -> 1303806;
			case "precious earthen battle jewel" -> 1303807;
			case "flawless earthen battle jewel" -> 1303808;
			case "perfect earthen battle jewel" -> 1303809;
			case "raw airy battle jewel" -> 1304000;
			case "uncut airy battle jewel" -> 1304001;
			case "rough airy battle jewel" -> 1304002;
			case "flawed airy battle jewel" -> 1304003;
			case "imperfect airy battle jewel" -> 1304004;
			case "polished airy battle jewel" -> 1304005;
			case "faceted airy battle jewel" -> 1304006;
			case "precious airy battle jewel" -> 1304007;
			case "flawless airy battle jewel" -> 1304008;
			case "perfect airy battle jewel" -> 1304009;
			case "raw dusty battle jewel" -> 1304200;
			case "uncut dusty battle jewel" -> 1304201;
			case "rough dusty battle jewel" -> 1304202;
			case "flawed dusty battle jewel" -> 1304203;
			case "imperfect dusty battle jewel" -> 1304204;
			case "polished dusty battle jewel" -> 1304205;
			case "faceted dusty battle jewel" -> 1304206;
			case "precious dusty battle jewel" -> 1304207;
			case "flawless dusty battle jewel" -> 1304208;
			case "perfect dusty battle jewel" -> 1304209;
			case "raw heated battle jewel" -> 1304400;
			case "uncut heated battle jewel" -> 1304401;
			case "rough heated battle jewel" -> 1304402;
			case "flawed heated battle jewel" -> 1304403;
			case "imperfect heated battle jewel" -> 1304404;
			case "polished heated battle jewel" -> 1304405;
			case "faceted heated battle jewel" -> 1304406;
			case "precious heated battle jewel" -> 1304407;
			case "flawless heated battle jewel" -> 1304408;
			case "perfect heated battle jewel" -> 1304409;
			case "raw watery war spell stone" -> 1304600;
			case "uncut watery war spell stone" -> 1304601;
			case "rough watery war spell stone" -> 1304602;
			case "flawed watery war spell stone" -> 1304603;
			case "imperfect watery war spell stone" -> 1304604;
			case "polished watery war spell stone" -> 1304605;
			case "faceted watery war spell stone" -> 1304606;
			case "precious watery war spell stone" -> 1304607;
			case "flawless watery war spell stone" -> 1304608;
			case "perfect watery war spell stone" -> 1304609;
			case "raw fiery war spell stone" -> 1304800;
			case "uncut fiery war spell stone" -> 1304801;
			case "rough fiery war spell stone" -> 1304802;
			case "flawed fiery war spell stone" -> 1304803;
			case "imperfect fiery war spell stone" -> 1304804;
			case "polished fiery war spell stone" -> 1304805;
			case "faceted fiery war spell stone" -> 1304806;
			case "precious fiery war spell stone" -> 1304807;
			case "flawless fiery war spell stone" -> 1304808;
			case "perfect fiery war spell stone" -> 1304809;
			case "raw dusty war spell stone" -> 1305000;
			case "uncut dusty war spell stone" -> 1305001;
			case "rough dusty war spell stone" -> 1305002;
			case "flawed dusty war spell stone" -> 1305003;
			case "imperfect dusty war spell stone" -> 1305004;
			case "polished dusty war spell stone" -> 1305005;
			case "faceted dusty war spell stone" -> 1305006;
			case "precious dusty war spell stone" -> 1305007;
			case "flawless dusty war spell stone" -> 1305008;
			case "perfect dusty war spell stone" -> 1305009;
			case "raw heated war spell stone" -> 1305200;
			case "uncut heated war spell stone" -> 1305201;
			case "rough heated war spell stone" -> 1305202;
			case "flawed heated war spell stone" -> 1305203;
			case "imperfect heated war spell stone" -> 1305204;
			case "polished heated war spell stone" -> 1305205;
			case "faceted heated war spell stone" -> 1305206;
			case "precious heated war spell stone" -> 1305207;
			case "flawless heated war spell stone" -> 1305208;
			case "perfect heated war spell stone" -> 1305209;
			case "raw earthen war spell stone" -> 1305400;
			case "uncut earthen war spell stone" -> 1305401;
			case "rough earthen war spell stone" -> 1305402;
			case "flawed earthen war spell stone" -> 1305403;
			case "imperfect earthen war spell stone" -> 1305404;
			case "polished earthen war spell stone" -> 1305405;
			case "faceted earthen war spell stone" -> 1305406;
			case "precious earthen war spell stone" -> 1305407;
			case "flawless earthen war spell stone" -> 1305408;
			case "perfect earthen war spell stone" -> 1305409;
			case "raw icy war spell stone" -> 1305400;
			case "uncut icy war spell stone" -> 1305401;
			case "rough icy war spell stone" -> 1305402;
			case "flawed icy war spell stone" -> 1305403;
			case "imperfect icy war spell stone" -> 1305404;
			case "polished icy war spell stone" -> 1305405;
			case "faceted icy war spell stone" -> 1305406;
			case "precious icy war spell stone" -> 1305407;
			case "flawless icy war spell stone" -> 1305408;
			case "perfect icy war spell stone" -> 1305409;
			case "raw airy war spell stone" -> 1305800;
			case "uncut airy war spell stone" -> 1305801;
			case "rough airy war spell stone" -> 1305802;
			case "flawed airy war spell stone" -> 1305803;
			case "imperfect airy war spell stone" -> 1305804;
			case "polished airy war spell stone" -> 1305805;
			case "faceted airy war spell stone" -> 1305806;
			case "precious airy war spell stone" -> 1305807;
			case "flawless airy war spell stone" -> 1305808;
			case "perfect airy war spell stone" -> 1305809;
			case "raw fiery nature spell stone" -> 1306000;
			case "uncut fiery nature spell stone" -> 1306001;
			case "rough fiery nature spell stone" -> 1306002;
			case "flawed fiery nature spell stone" -> 1306003;
			case "imperfect fiery nature spell stone" -> 1306004;
			case "polished fiery nature spell stone" -> 1306005;
			case "faceted fiery nature spell stone" -> 1306006;
			case "precious fiery nature spell stone" -> 1306007;
			case "flawless fiery nature spell stone" -> 1306008;
			case "perfect fiery nature spell stone" -> 1306009;
			case "raw finesse war spell stone" -> 1306200;

			default -> 0;
		};
	}
}
