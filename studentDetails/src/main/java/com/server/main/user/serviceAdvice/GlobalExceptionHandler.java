package com.server.main.user.serviceAdvice;

import org.springframework.http.HttpStatus;

public class GlobalExceptionHandler extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String exceptionMessage;
	private HttpStatus httpStatus;

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public void setExceptionMessage(String exceptionMessage) {
		this.exceptionMessage = exceptionMessage;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public GlobalExceptionHandler(String exceptionMessage, HttpStatus httpStatus) {
		super(exceptionMessage);
		this.exceptionMessage = exceptionMessage;
		this.httpStatus = httpStatus;
	}

	public GlobalExceptionHandler() {

	}

}
