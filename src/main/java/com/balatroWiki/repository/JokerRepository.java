package com.balatroWiki.repository;

import com.balatroWiki.entity.Joker;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JokerRepository extends JpaRepository<Joker, Integer> {

	@Query(value = "SELECT * FROM jokers WHERE rarity=?", nativeQuery = true)
	List<Joker> findAllByRarity(String rarity);

	@Query(value = "SELECT * FROM jokers WHERE type=?", nativeQuery = true)
	List<Joker> findAllByType(String type);

	@Query(value = "SELECT * FROM jokers WHERE activation=?", nativeQuery = true)
	List<Joker> findAllByActivation(String activation);
}
