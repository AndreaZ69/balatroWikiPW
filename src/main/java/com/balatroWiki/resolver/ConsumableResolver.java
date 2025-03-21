package com.balatroWiki.resolver;

import com.balatroWiki.entity.Consumable;
import com.balatroWiki.service.ConsumableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ConsumableResolver {
	@Autowired
	private ConsumableService consumableService;

	@QueryMapping
	public List<Consumable> consumables(@Argument Integer id, @Argument String name, @Argument String type) {
		
		Consumable filter = new Consumable(
				id, 
				name,
				type, 
				null,
				null
		);
		
		return consumableService.findAll(filter);
	}
}
