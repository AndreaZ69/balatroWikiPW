package com.balatroWiki.resolver;

import com.balatroWiki.entity.Consumable;
import com.balatroWiki.service.ConsumableService;
import com.balatroWiki.enums.ConsumableTypeEnum;

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
	public List<Consumable> consumables(@Argument Integer id, @Argument String name, @Argument ConsumableTypeEnum type) {
		String checkedType = (type != null) ? type.getValue() : null;
		
		Consumable filter = new Consumable(
				id, 
				name, 
				checkedType, 
				null,
				null
		);
		
		return consumableService.findAll(filter);
	}
}
