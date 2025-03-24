package com.balatroWiki.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import com.balatroWiki.entity.Consumable;
import com.balatroWiki.repository.ConsumableRepository;

@Service
public class ConsumableService {
	private final ConsumableRepository repository;
	
	public ConsumableService(ConsumableRepository repository) {
		this.repository = repository;
	}
	
	public List<Consumable> findAll(Consumable temp){
		ExampleMatcher exampleMatcher = ExampleMatcher
				.matchingAny()
				.withMatcher("name", ExampleMatcher.GenericPropertyMatchers.startsWith().ignoreCase());
		
		Example<Consumable> example = Example.of(temp, exampleMatcher);
		
		return repository.findAll(example);
	}
}