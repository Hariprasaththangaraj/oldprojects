package com.javatpoint.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javatpoint.server.main.user.modelresponse.UserModel;
import com.javatpoint.server.main.user.service.EmptyResponse;
import com.javatpoint.server.main.user.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/Api/v1/user")
	public ResponseEntity<UserModel> add(@RequestBody UserModel userModel) {
		UserModel adddetails = userService.add(userModel);
		return new ResponseEntity<>(adddetails, HttpStatus.CREATED);
	}

	@GetMapping("/api/v1/user/{sno}")
	public ResponseEntity<UserModel> get(@PathVariable("sno") int getL) throws EmptyResponse {
		UserModel getdetails = userService.get(getL);
		return new ResponseEntity<>(getdetails, HttpStatus.OK);
	}

	@PutMapping("/api/v1/user")
	public ResponseEntity<UserModel> put(@RequestBody UserModel userModel) {
		UserModel putdetails = userService.put(userModel);
		return new ResponseEntity<>(putdetails, HttpStatus.CREATED);
	}

	@DeleteMapping("/api/v1/user/{sno}")
	public ResponseEntity delete(@PathVariable("sno") int getL) {
		userService.delete(getL);
		return new ResponseEntity(HttpStatus.ACCEPTED);
	}
}
