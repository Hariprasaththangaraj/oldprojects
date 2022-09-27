package com.server.main.user.microconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class MicroserviceConfig {

	@Bean
	public RestTemplate getrestTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}
}
