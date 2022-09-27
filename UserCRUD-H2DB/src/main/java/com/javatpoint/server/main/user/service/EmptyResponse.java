package com.javatpoint.server.main.user.service;

import org.springframework.http.HttpStatus;

public class EmptyResponse extends RuntimeException {

	public EmptyResponse(HttpStatus badRequest) {
	    super("no data found");
	      
	}

	
}
