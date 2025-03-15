package com.balatroWiki.resolver;

import com.balatroWiki.entity.Joker;
import com.balatroWiki.enums.JokerTypeEnum;
import com.balatroWiki.enums.JokerActivationEnum;
import com.balatroWiki.service.JokerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class JokerResolver {
	@Autowired
	private JokerService jokerService;

	@QueryMapping
	public List<Joker> jokers(@Argument Integer id, @Argument String name, @Argument String rarity, @Argument JokerTypeEnum type, @Argument JokerActivationEnum activation) {
		String checkedType = (type != null) ? type.getValue() : null;
		String checkedActivation = (activation != null) ? activation.getValue() : null;
		
		Joker filter = new Joker(
				id, 
				name, 
				rarity, 
				null, 
				null, 
				null, 
				checkedType, 
				checkedActivation);
		return jokerService.findAll(filter);
	}
}