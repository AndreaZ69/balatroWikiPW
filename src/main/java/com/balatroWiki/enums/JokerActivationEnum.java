package com.balatroWiki.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum JokerActivationEnum {
	PASSIVE("Passive"), 
	INDEPENDENT("Independent"), 
	ON_PLAYED("On Played"), 
	ON_SCORED("On Scored"), 
	ON_HELD("On Held"),
	ON_DISCARD("On Discard"), 
	MIXED("Mixed"), 
	ON_OTHER_JOKERS("On Other Jokers");

	public final String value;

	private JokerActivationEnum(String value) {
		this.value = value;
	}
	
	@JsonValue
	public String getValue() {
		return this.value;
	}
}
