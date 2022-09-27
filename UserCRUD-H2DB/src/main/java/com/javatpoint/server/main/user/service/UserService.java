package com.javatpoint.server.main.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.javatpoint.server.main.user.controllermessages.DeleteMessage;
import com.javatpoint.server.main.user.dao.UserRepository;
import com.javatpoint.server.main.user.modelresponse.UserModel;

@Service
public class UserService implements Serviceinterface {

	@Autowired
	private UserRepository userRepository;

	public UserModel add(UserModel userModel) {
		return userRepository.save(userModel);
	}

	public UserModel get(int getL) throws EmptyResponse {

		Optional<UserModel> userData = userRepository.findById(getL);

		if (!userData.isPresent())
			
			//doubt
			throw new EmptyResponse(HttpStatus.BAD_REQUEST);

		return userData.get();
	}

	public UserModel put(UserModel userModel) {

		return userRepository.save(userModel);
	}

	public void delete(int getL) {
		try {
			userRepository.deleteById(getL);	
		}catch(Exception e) {
			throw new EmptyResponse(HttpStatus.BAD_GATEWAY);
		}
		
	}


}
