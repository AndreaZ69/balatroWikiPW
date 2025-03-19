package com.balatroWiki.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "consumables")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consumable {
	@Id
	private Integer id;
	
	private String name;
	private String type;
	private String description;
	private String imageLink;
}