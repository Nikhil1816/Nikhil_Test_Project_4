package com.wyvaa.onemyle.people.profile.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Profile_Config {
    
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
}