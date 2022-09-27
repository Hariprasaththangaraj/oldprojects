package com.server.main.user.serviceAdvice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {
	
	Logger logger = LoggerFactory.getLogger(GlobalExceptionController.class);

	@ExceptionHandler(GlobalExceptionHandler.class)
	public ResponseEntity<GlobalExceptionRequest> serviceException(GlobalExceptionHandler ex) {
		logger.info("GLOBAL EXCEPTION TRIGGERED!!");
				return new ResponseEntity<>(
				new GlobalExceptionRequest(ex.getHttpStatus(), ex.getExceptionMessage()), HttpStatus.I_AM_A_TEAPOT);
	}
}
	