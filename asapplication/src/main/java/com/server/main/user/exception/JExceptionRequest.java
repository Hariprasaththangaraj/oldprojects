package com.server.main.user.exception;

public class JExceptionRequest {


	private String message;


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JExceptionRequest(String message) {
		super();
		this.message = message;
	}

}
