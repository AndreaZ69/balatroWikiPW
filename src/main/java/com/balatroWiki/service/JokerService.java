package com.balatroWiki.service;

import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.balatroWiki.entity.Joker;
import com.balatroWiki.repository.JokerRepository;

@Service
public class JokerService {
	private final JokerRepository repository;
	
	public JokerService(JokerRepository repository) {
		this.repository = repository;
	}
	
	public List<Joker> findAll(Joker temp){
		Example<Joker> example = Example.of(temp);
		return repository.findAll(example);
	}
}