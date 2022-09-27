package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class MicroserviceController {

	@Autowired
	private RestTemplate restTemplate;	
	
	@GetMapping("v1/callingothergetservice")
	public String getStudentDetails(){
		 String studentDetails = restTemplate.getForObject("http://localhost:8081/v1/getstudent/", String.class);		
		return studentDetails;		
	} 
	
}

