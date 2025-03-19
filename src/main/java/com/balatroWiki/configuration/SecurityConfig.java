package com.balatroWiki.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class SecurityConfig implements WebMvcConfigurer{
	
	@Override
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**")
		.allowedOriginPatterns("http://localhost:5173", "frontend heroku link TBA")
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS");
	}
}
