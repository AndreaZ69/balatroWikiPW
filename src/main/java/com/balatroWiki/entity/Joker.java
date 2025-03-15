package com.balatroWiki.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "jokers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Joker {
	@Id
	private Integer id;

	private String name;
	private String rarity;
	private String description;
	private String unlockMethod;

	private Integer price;
	
	private String type;
	private String activation;
	private String imageLink;
}
