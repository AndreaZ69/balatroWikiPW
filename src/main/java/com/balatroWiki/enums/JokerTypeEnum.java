package com.balatroWiki.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JokerTypeEnum {
	CHIPS("Chips"), 
	ADDITIVE_MULT("Additive Mult"), 
	MULTIPLICATIVE_MULT("Multiplicative Mult"),
	CHIPS_AND_ADDITIVE_MULT("Chips & Additive Mult"), 
	RETRIGGER("Retrigger"), 
	ECONOMY("Economy"), 
	EFFECT("Effect");

	public final String value;

	private JokerTypeEnum(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String getValue() {
		return this.value;
	}
}