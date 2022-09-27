package com.server.main.user.serviceAdvice;

import org.springframework.http.HttpStatus;

public class GlobalExceptionRequest {

	private HttpStatus httpStatus;
	private String excpetionMessage;

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public String getExcpetionMessage() {
		return excpetionMessage;
	}

	public void setExcpetionMessage(String excpetionMessage) {
		this.excpetionMessage = excpetionMessage;
	}

	public GlobalExceptionRequest(HttpStatus httpStatus, String excpetionMessage) {
		super();
		this.httpStatus = httpStatus;
		this.excpetionMessage = excpetionMessage;
	}	
	
	public GlobalExceptionRequest() {
	
	}	
	
}
