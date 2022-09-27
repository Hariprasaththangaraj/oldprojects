package com.server.main.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class JExceptionReponse {

	@ExceptionHandler(additionException.class)
	public ResponseEntity<JExceptionRequest> serviceException(additionException ex) {
		return new ResponseEntity<>(new JExceptionRequest(ex.getMessage()), HttpStatus.BAD_REQUEST);

	}

}
