package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.service.ApplicationService;

@RestController
public class ApplicationController {

	@Autowired
	private ApplicationService applicationService;

	@PostMapping("/add/{firstnum}/{secondnum}")
	// response // request
	public ResponseEntity<ResultResponse> addition(@PathVariable int firstnum, @PathVariable int secondnum) {
		ResultResponse result = applicationService.add(firstnum, secondnum);
		return new ResponseEntity<>(result, HttpStatus.OK);
	}

	@PostMapping("/addition")
	public ResponseEntity<ResultResponse> addmethod(@RequestBody JResult jResult) {
		ResultResponse result = applicationService.addition(jResult);
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}

	@PostMapping("/subtraction")
	public ResponseEntity<ResultResponse> subtraction(@RequestBody JResult jResult) {
		ResultResponse result = applicationService.subtraction(jResult);
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}

	@PostMapping("/Division")
	public ResponseEntity<ResultResponse> divisionmethod(@RequestBody JResult jResult) {
		ResultResponse result = applicationService.division(jResult);
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}

	@PostMapping("/Multiplication")
	public ResponseEntity<ResultResponse> multiplicationmethod(@RequestBody JResult jResult) {
		ResultResponse result = applicationService.mulitiplication(jResult);
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
}
