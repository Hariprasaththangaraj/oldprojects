package com.server.main.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ExceptionCalculation.class)
	public ResponseEntity<JRexception> calcException(ExceptionCalculation ex){		
		return new ResponseEntity<>(new JRexception(ex.getMessage()),HttpStatus.BAD_REQUEST );			
	}

}
