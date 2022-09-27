package com.server.main.user.exception;

import org.springframework.http.HttpStatus;

public class EmailException extends RuntimeException {

	private final HttpStatus statusCode;
	private final String errorcode;

	public EmailException(String message, HttpStatus statusCode, String errorcode) {
		super(message);
		this.statusCode = statusCode;
		this.errorcode = errorcode;
	}

	public HttpStatus getStatusCode() {
		return statusCode;
	}

	public String getErrorcode() {
		return errorcode;
	}

}