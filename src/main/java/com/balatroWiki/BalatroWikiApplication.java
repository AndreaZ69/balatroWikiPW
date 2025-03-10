package com.balatroWiki;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.balatroWiki.entity")
@EnableJpaRepositories("com.balatroWiki.repository")
@SpringBootApplication
public class BalatroWikiApplication {
	public static void main(String[] args) {
		SpringApplication.run(BalatroWikiApplication.class, args);
	}
}
