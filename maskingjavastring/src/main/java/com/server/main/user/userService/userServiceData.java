package com.server.main.user.userService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.main.user.userDAO.userDatabase;
import com.server.main.user.userRequest.jsonRequest;
import com.server.main.user.userResponse.userResponseData;

@Service
public class userServiceData {

	@Autowired
	public userDatabase UserDatabase;

	public userResponseData maskMethod(jsonRequest JsonRequest) {

		userResponseData UserResponseData = new userResponseData();
		JsonRequest.setUserId(UserResponseData.getUserId());
		JsonRequest.setUserName(UserResponseData.getUserName());

		userResponseData savedData = UserDatabase.save(UserResponseData);

		return savedData;

	}

}
