package com.server.main.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestClient {
	
	
	@Autowired
	RestTemplate restTemplate;
	
				// T response data type(any - generic)
	public <T,Z> T restPost(String url,Z request,Class<T> response) {
		HttpEntity<Z> httpEntity = new HttpEntity<>(request);
		return restTemplate.exchange(url,
				HttpMethod.POST, httpEntity,response).getBody();
		
	}

}
