package com.balatroWiki.repository;

import com.balatroWiki.entity.Joker;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

@Repository
public interface JokerRepository extends JpaRepository<Joker, Integer>, QueryByExampleExecutor<Joker> {
}