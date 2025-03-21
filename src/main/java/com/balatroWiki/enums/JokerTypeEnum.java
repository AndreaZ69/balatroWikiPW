package com.balatroWiki.enums;

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

	public String getValue() {
		return this.value;
	}
}