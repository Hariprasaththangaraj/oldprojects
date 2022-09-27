package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.bean.JRequest;
import com.server.main.user.bean.JResponse;
import com.server.main.user.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/api/v1/perform",produces = MediaType.APPLICATION_JSON_VALUE,consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<JResponse> calculation(@RequestBody JRequest jRequest) {

	//	JResponse result = userService.perform(jRequest);
		
		JResponse result = userService.newperform(jRequest);

		return new ResponseEntity<>(result, HttpStatus.OK);

	}

}
