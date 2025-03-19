package com.balatroWiki.enums;

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

	public String getValue() {
		return this.value;
	}
}
