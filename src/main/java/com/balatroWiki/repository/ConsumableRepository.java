package com.balatroWiki.repository;

import com.balatroWiki.entity.Consumable;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.QueryByExampleExecutor;

@Repository
public interface ConsumableRepository extends JpaRepository<Consumable, Integer>, QueryByExampleExecutor<Consumable> {
};