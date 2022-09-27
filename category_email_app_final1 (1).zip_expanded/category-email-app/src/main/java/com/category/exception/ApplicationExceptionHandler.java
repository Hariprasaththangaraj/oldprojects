package com.category.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.category.model.Response;

@RestControllerAdvice
public class ApplicationExceptionHandler {

	@ExceptionHandler(Exception.class)
	public ResponseEntity<Response> handleException(Exception ex) 
	{
		return new ResponseEntity<Response>(new Response("Exception Occurred"), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
