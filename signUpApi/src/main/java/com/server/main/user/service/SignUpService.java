package com.server.main.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.main.user.repo.SignUpRepository;
import com.server.main.user.requestDTO.SignUpRequest;
import com.server.main.user.responseDTO.SignUpResponse;

@Service
public class SignUpService {

	@Autowired
	SignUpRepository signUpRepository;

	public void saveData(SignUpRequest signUpRequest) {

		SignUpResponse signUpResponse = new SignUpResponse();

		signUpResponse.setName(signUpRequest.getName());
		signUpResponse.setEmailId(signUpRequest.getEmailId());
		signUpResponse.setGender(signUpRequest.getGender());
		signUpResponse.setPhoneNumber(signUpRequest.getPhoneNumber());
		signUpRequest.setPassWord(signUpRequest.getPassWord());
		
		
		signUpRepository.save(signUpResponse);
	}

}
