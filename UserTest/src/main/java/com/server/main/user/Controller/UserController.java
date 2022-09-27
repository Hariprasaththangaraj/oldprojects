package com.server.main.user.Controller;





import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.ResponseModel.UserDAO;
import com.server.main.user.ResquestModel.UserRequest;
import com.server.main.user.Service.UserService;

@Validated
@RestController("/")
public class UserController {
	
	
	@Autowired
	private UserService userService;
	
	@PostMapping("User/post")
	public ResponseEntity<UserDAO> postmethod(@Valid @RequestBody UserRequest userRequest ){
		UserDAO post = userService.postmethod(userRequest);
		return new ResponseEntity<>(post,HttpStatus.ACCEPTED);
		}

}
