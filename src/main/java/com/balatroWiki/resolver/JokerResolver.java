package com.balatroWiki.resolver;

import com.balatroWiki.entity.Joker;
import com.balatroWiki.enums.TypeEnum;
import com.balatroWiki.enums.ActivationEnum;
import com.balatroWiki.repository.JokerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JokerResolver {
	
	@Autowired
	private JokerRepository jokerRepository;
	
	@QueryMapping
	public List<Joker> jokers() {
		return jokerRepository.findAll();
	}
	
	@QueryMapping
	public List<Joker> jokersByRarity(@Argument String rarity) {
		return jokerRepository.findAllByRarity(rarity);
	}
	
	@QueryMapping
	public List<Joker> jokersByType(@Argument TypeEnum type) {
		System.out.println(type.getValue());
		return jokerRepository.findAllByType(type.getValue());
	}
	
	@QueryMapping
	public List<Joker> jokersByActivation(@Argument ActivationEnum activation) {
		return jokerRepository.findAllByActivation(activation.getValue());
	}
}
