package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.userRequest.jsonRequest;
import com.server.main.user.userResponse.userResponseData;
import com.server.main.user.userService.userServiceData;

@RestController
public class userController {

	@Autowired
	public userServiceData UserServiceData;

	@PostMapping("/mask")
	public ResponseEntity<userResponseData> maskMethod(@RequestBody jsonRequest JsonRequest) {
		userResponseData userData = UserServiceData.maskMethod(JsonRequest);
		return new ResponseEntity<>(userData, HttpStatus.OK);
	}

}
