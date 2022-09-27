package com.server.main.user.exception;

import org.springframework.http.HttpStatus;

public class additionException extends RuntimeException {

	private HttpStatus httpStatus;
	private String message1;
	
	public additionException(HttpStatus httpStatus,String message1) {
		super(message1);
		this.httpStatus = httpStatus;
		this.message1=message1;
	}
}
