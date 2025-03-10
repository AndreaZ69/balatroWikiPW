package com.balatroWiki.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Table(name = "jokers")
@Data
public class Joker {
	@Id
	private int id;
	
	private String name;
	private String rarity;
	
	private String description;
	private String unlockMethod;
	
	private int price;
	private String type;
	
	private String activation;
}
