package com.server.main.user.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.RequestEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.requestDTO.SignUpRequest;
import com.server.main.user.service.SignUpService;

@RestController
public class SignUpController {
	
	@Autowired
	SignUpService signUpService;
	
	@PostMapping("/Signup")
	public RequestEntity<SignUpRequest> signUpController(@RequestBody SignUpRequest signUpRequest){
		
		signUpService.saveData(signUpRequest);
		return null;		
	}
	

}
