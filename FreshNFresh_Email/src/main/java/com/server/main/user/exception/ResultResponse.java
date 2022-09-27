package com.server.main.user.exception;

import lombok.Data;

@Data
public class ResultResponse {

	private String message;
	private String errorcode;

	public ResultResponse(String message, String errorcode) {
		super();
		this.message = message;
		this.errorcode = errorcode;
	}

	public ResultResponse() {

	}

}
