package it.simonecelia.edenSCputitinbarsBE.enumeration;

import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.HITS;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.RESIST;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALL;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_MID;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.STAT;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.UNSET;


public enum GemName {
	BLOOD_ESSENCE_JEWEL ( HITS, 1308400 ),
	MYSTICAL_ESSENCE_JEWEL ( UNSET, 1308600 ),
	HEATED_EVOCATION_SIGIL ( SKILL_ALB, 1308400 ),
	EARTHEN_FERVOR_SIGIL ( SKILL_ALB, 1307200 ),
	HEATED_BATTLE_JEWEL ( SKILL_ALL, 1304400 ),
	VAPOR_WAR_SIGIL ( SKILL_ALB, 1304800 ),
	FIERY_WAR_SIGIL ( SKILL_ALB, 1308400 ),
	ASHEN_FERVOR_SIGIL ( SKILL_ALB, 1311800 ),
	VACUOUS_FERVOR_SIGIL ( SKILL_ALB, 1311400 ),
	ICY_WAR_SIGIL ( SKILL_ALB, 1306200 ),
	EARTHEN_EVOCATION_SIGIL ( SKILL_ALB, 1307600 ),
	AIRY_FERVOR_SIGIL ( SKILL_ALB, 1306800 ),
	DUSTY_BATTLE_JEWEL ( SKILL_ALL, 1304200 ),
	MOLTEN_MAGMA_WAR_SIGIL ( SKILL_ALB, 1311200 ),
	FIERY_EVOCATION_SIGIL ( SKILL_ALB, 1308000 ),
	WATERY_FERVOR_SIGIL ( SKILL_ALB, 1307000 ),
	ICY_EVOCATION_SIGIL ( SKILL_ALB, 1307800 ),
	VAPOR_FERVOR_SIGIL ( SKILL_ALB, 1307400 ),
	AIRY_WAR_SIGIL ( SKILL_ALB, 1305600 ),
	DUSTY_EVOCATION_SIGIL ( SKILL_ALB, 1308600 ),
	WATERY_EVOCATION_SIGIL ( SKILL_ALB, 1309000 ),
	SALT_ENCRUSTED_FERVOR_SIGIL ( SKILL_ALB, null ),
	VAPOR_BATTLE_JEWEL ( SKILL_ALL, 1303400 ),
	EARTHEN_WAR_SIGIL ( SKILL_ALB, 1305400 ),
	FIERY_BATTLE_JEWEL ( SKILL_ALL, 1303600 ),
	WATERY_WAR_SIGIL ( SKILL_ALB, 1304600 ),
	FIERY_FERVOR_SIGIL ( SKILL_ALB, 1306600 ),
	STEAMING_FERVOR_SIGIL ( SKILL_ALB, 1312000 ),
	VAPOR_EVOCATION_SIGIL ( SKILL_ALB, 1308800 ),
	EARTHEN_BATTLE_JEWEL ( SKILL_ALB, 1303800 ),
	AIRY_BATTLE_JEWEL ( SKILL_ALL, 1304000 ),
	DUSTY_WAR_SIGIL ( SKILL_ALB, 1305000 ),
	HEATED_WAR_SIGIL ( SKILL_ALB, 1305200 ),
	AIRY_EVOCATION_SIGIL ( SKILL_ALB, 1308200 ),
	FINESSE_WAR_SIGIL ( SKILL_ALB, 1306000 ),
	FINESSE_FERVOR_SIGIL ( SKILL_ALB, 1306400 ),
	AIRY_CHAOS_RUNE ( SKILL_MID, 1308000 ),
	EARTHEN_WAR_RUNE ( SKILL_MID, 1305000 ),
	AIRY_PRIMAL_RUNE ( SKILL_MID, 1306600 ),
	EARTHEN_PRIMAL_RUNE ( SKILL_MID, 1306200 ),
	ASHEN_PRIMAL_RUNE ( SKILL_MID, 1310000 ),
	AIRY_WAR_RUNE ( SKILL_MID, 1305400 ),
	BLIGHTED_PRIMAL_RUNE ( SKILL_MID, null ),
	ICY_CHAOS_RUNE ( SKILL_MID, 1307000 ),
	FIERY_WAR_RUNE ( SKILL_MID, 1304800 ),
	LIGHTNING_CHARGED_WAR_RUNE ( SKILL_MID, null ),
	UNHOLY_PRIMAL_RUNE ( SKILL_MID, null ),
	ICY_WAR_RUNE ( SKILL_MID, 1305800 ),
	WATERY_CHAOS_RUNE ( SKILL_MID, 1307800 ),
	EARTHEN_CHAOS_RUNE ( SKILL_MID, 1308400 ),
	VALIANT_PRIMAL_RUNE ( SKILL_MID, null ),
	HEATED_CHAOS_RUNE ( SKILL_MID, 1307400 ),
	HEATED_WAR_RUNE ( SKILL_MID, 1305200 ),
	FIERY_PRIMAL_RUNE ( SKILL_MID, 1306800 ),
	FIERY_CHAOS_RUNE ( SKILL_MID, 1308200 ),
	VAPOR_CHAOS_RUNE ( SKILL_MID, 1307600 ),
	DUSTY_CHAOS_RUNE ( SKILL_MID, 1307200 ),
	WATERY_WAR_RUNE ( SKILL_MID, 1304600 ),
	VAPOR_WAR_RUNE ( SKILL_MID, 1305600 ),
	FINESSE_WAR_RUNE ( SKILL_MID, 1306000 ),
	FINESSE_PRIMAL_RUNE ( SKILL_MID, 1306400 ),
	STEAMING_NATURE_SPELL_STONE ( SKILL_HIB, 1310000 ),
	WATERY_WAR_SPELL_STONE ( SKILL_HIB, 1304600 ),
	FIERY_WAR_SPELL_STONE ( SKILL_HIB, 1304800 ),
	ICY_WAR_SPELL_STONE ( SKILL_HIB, 1305400 ),
	EARTHEN_WAR_SPELL_STONE ( SKILL_HIB, 1305400 ),
	OOZING_NATURE_SPELL_STONE ( SKILL_HIB, 1310200 ),
	ABERRANT_ARCANE_SPELL_STONE ( SKILL_HIB, null ),
	VAPOR_ARCANE_SPELL_STONE ( SKILL_HIB, 1307800 ),
	ETHEREAL_ARCANE_SPELL_STONE ( SKILL_HIB, 1312200 ),
	HEATED_WAR_SPELL_STONE ( SKILL_HIB, 1305200 ),
	FIERY_ARCANE_SPELL_STONE ( SKILL_HIB, 1307400 ),
	WATERY_ARCANE_SPELL_STONE ( SKILL_HIB, 1307600 ),
	EARTHEN_ARCANE_SPELL_STONE ( SKILL_HIB, 1308200 ),
	AIRY_NATURE_SPELL_STONE ( SKILL_HIB, 1307000 ),
	EARTHEN_NATURE_SPELL_STONE ( SKILL_HIB, 1306800 ),
	FIERY_NATURE_SPELL_STONE ( SKILL_HIB, 1306000 ),
	PHANTASMAL_ARCANE_SPELL_STONE ( SKILL_HIB, 1312000 ),
	DUSTY_WAR_SPELL_STONE ( SKILL_HIB, null ),
	AIRY_WAR_SPELL_STONE ( SKILL_HIB, 1305800 ),
	WATERY_NATURE_SPELL_STONE ( SKILL_HIB, 1306400 ),
	LIGHT_WAR_SPELL_STONE ( SKILL_HIB, 1309800 ),
	SHADOWY_ARCANE_SPELL_STONE ( SKILL_HIB, null ),
	SPECTRAL_ARCANE_SPELL_STONE ( SKILL_HIB, 1311800 ),
	EMBRACING_ARCANE_SPELL_STONE ( SKILL_HIB, null ),
	AIRY_ARCANE_SPELL_STONE ( SKILL_HIB, 1307200 ),
	MINERAL_ENCRUSTED_NATURE_SPELL_STONE ( SKILL_HIB, 1310400 ),
	ICY_ARCANE_SPELL_STONE ( SKILL_HIB, 1308000 ),
	FINESSE_WAR_SPELL_STONE ( SKILL_HIB, 1306200 ),
	FINESSE_NATURE_SPELL_STONE ( SKILL_HIB, 1306600 ),
	STEAMING_FOCUS_STONE ( FOCUS_HIB, null ),
	OOZING_FOCUS_STONE ( FOCUS_HIB, null ),
	VAPOR_FOCUS_STONE ( FOCUS_HIB, null ),
	ETHEREAL_FOCUS_STONE ( FOCUS_HIB, null ),
	FIERY_FOCUS_STONE ( FOCUS_HIB, null ),
	WATERY_FOCUS_STONE ( FOCUS_HIB, null ),
	EARTHEN_FOCUS_STONE ( FOCUS_HIB, null ),
	PHANTASMAL_FOCUS_STONE ( FOCUS_HIB, null ),
	SPECTRAL_ARCANE_FOCUS_STONE ( FOCUS_HIB, null ),
	MINERAL_ENCRUSTED_FOCUS_STONE ( FOCUS_HIB, null ),
	ICY_FOCUS_STONE ( FOCUS_HIB, null ),
	BRILLIANT_FOCUS_STONE ( FOCUS_HIB, null ),
	ASHEN_FOCUS_RUNE ( FOCUS_ALB, null ),
	VACUOUS_FOCUS_SIGIL ( FOCUS_ALB, null ),
	EARTHEN_FOCUS_SIGIL ( FOCUS_ALB, null ),
	FIERY_FOCUS_SIGIL ( FOCUS_ALB, null ),
	DUSTY_FOCUS_SIGIL ( FOCUS_ALB, null ),
	WATERY_FOCUS_SIGIL ( FOCUS_ALB, null ),
	SALT_ENCRUSTED_FOCUS_SIGIL ( FOCUS_ALB, null ),
	VAPOR_FOCUS_SIGIL ( FOCUS_ALB, null ),
	AIRY_FOCUS_SIGIL ( FOCUS_ALB, null ),
	BRILLIANT_FOCUS_SIGIL ( FOCUS_ALB, null ),
	DUSTY_SHIELDING_JEWEL ( RESIST, 1302800 ),
	ICY_SHIELDING_JEWEL ( RESIST, 1301800 ),
	HEATED_SHIELDING_JEWEL ( RESIST, 1302000 ),
	LIGHT_SHIELDING_JEWEL ( RESIST, 1302200 ),
	EARTHEN_SHIELDING_JEWEL ( RESIST, 1301600 ),
	VAPOR_SHIELDING_JEWEL ( RESIST, 1302600 ),
	AIRY_SHIELDING_JEWEL ( RESIST, 1302400 ),
	FIERY_SHIELDING_JEWEL ( RESIST, 1303000 ),
	WATERY_SHIELDING_JEWEL ( RESIST, 1303200 ),
	FIERY_ESSENCE_JEWEL ( STAT, 1300000 ),
	VAPOR_ESSENCE_JEWEL ( STAT, 1300400 ),
	AIRY_ESSENCE_JEWEL ( STAT, 1300600 ),
	EARTHEN_ESSENCE_JEWEL ( STAT, 1300200 ),
	DUSTY_ESSENCE_JEWEL ( STAT, 1301200 ),
	WATERY_ESSENCE_JEWEL ( STAT, 1300800 ),
	HEATED_ESSENCE_JEWEL ( STAT, 1301000 ),
	ICY_ESSENCE_JEWEL ( STAT, 1301400 ),
	FIRE_SPELL_STONE ( UNSET, 1308800 ),
	WATER_SPELL_STONE ( UNSET, 1309000 ),
	VAPOR_SPELL_STONE ( UNSET, 1309200 ),
	ICE_SPELL_STONE ( UNSET, 1309400 ),
	EARTH_SPELL_STONE ( UNSET, 1309600 ),
	STEAMING_SPELL_STONE ( UNSET, 1310600 ),
	OOZING_SPELL_STONE ( UNSET, 1310800 ),
	MINERAL_ENCRUSTED_SPELL_STONE ( UNSET, 1311000 ),
	SPECTRAL_SPELL_STONE ( UNSET, 1311200 ),
	PHANTASMAL_SPELL_STONE ( UNSET, 1311400 ),
	ETHEREAL_SPELL_STONE ( UNSET, 1311600 ),
	BRILLIANT_SPELL_STONE ( UNSET, 1312400 ),
	ICE_RUNE ( UNSET, 1309000 ),
	DUST_RUNE ( UNSET, 1309200 ),
	HEAT_RUNE ( UNSET, 1309400 ),
	VAPOR_RUNE ( UNSET, 1309600 ),
	LIGHTNING_CHARGED_WAR ( UNSET, 1309800 ),
	ASHEN_RUNE ( UNSET, 1310200 ),
	BRILLIANT_RUNE ( UNSET, 1310600 ),
	EARTH_SIGIL ( UNSET, 1309600 ),
	ICE_SIGIL ( UNSET, 1309800 ),
	FIRE_SIGIL ( UNSET, 1310000 ),
	AIR_SIGIL ( UNSET, 1310200 ),
	HEAT_SIGIL ( UNSET, 1310400 ),
	DUST_SIGIL ( UNSET, 1310600 ),
	VAPOR_SIGIL ( UNSET, 1310800 ),
	WATER_SIGIL ( UNSET, 1311000 ),
	VACUOUS_SIGIL ( UNSET, 1312200 ),
	SALT_CRUSTED_FERVOR_SIGIL ( UNSET, 1311600 ),
	SALT_CRUSTED_SIGIL ( UNSET, 1312400 ),
	ASHEN_SIGIL ( UNSET, 1312600 ),
	BRILLIANT_SIGIL ( UNSET, 1313000 ),

	;

	GemName ( GemType type, Integer baseId ) {

	}
}
