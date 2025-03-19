package com.balatroWiki.enums;

public enum ConsumableTypeEnum {
	TAROT("Tarot"), 
	PLANET("Planet"), 
	SPECTRAL("Spectral");

	public final String value;

	private ConsumableTypeEnum(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}
}