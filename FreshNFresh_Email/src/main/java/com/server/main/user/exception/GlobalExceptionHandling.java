


package com.server.main.user.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandling {
	
	@ExceptionHandler(EmailException.class)
	public ResponseEntity<ResultResponse> exceptionHandler(EmailException ex){
		return new ResponseEntity<>(new ResultResponse(ex.getMessage(),ex.getErrorcode()),ex.getStatusCode());
	}

}



