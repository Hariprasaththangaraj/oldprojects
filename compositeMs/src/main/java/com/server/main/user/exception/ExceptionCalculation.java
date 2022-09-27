package com.server.main.user.exception;

import org.springframework.http.HttpStatus;

public class ExceptionCalculation extends RuntimeException {

	private HttpStatus httpStatus;
	private String message;
	
	
	public ExceptionCalculation(String message, HttpStatus httpStatus) {
		super(message);
		this.httpStatus = httpStatus;
		this.message = message;
	}


	public HttpStatus getHttpStatus() {
		return httpStatus;
	}


	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}

	
}
