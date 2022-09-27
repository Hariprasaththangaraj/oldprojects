package com.server.main.user.exception;

public class JRexception {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public JRexception(String message) {
		super();
		this.message = message;
	}

	public JRexception() {
	}

}
