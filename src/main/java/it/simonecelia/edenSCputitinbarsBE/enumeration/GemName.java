package it.simonecelia.edenSCputitinbarsBE.enumeration;

import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.FOCUS_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.HITS;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_ALL;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_HIB;
import static it.simonecelia.edenSCputitinbarsBE.enumeration.GemType.SKILL_MID;
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

	;

	GemName ( GemType type, Integer baseId ) {

	}
}
