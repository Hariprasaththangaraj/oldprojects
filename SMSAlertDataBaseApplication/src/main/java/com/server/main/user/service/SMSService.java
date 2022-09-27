package com.server.main.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.main.user.DTOrepository.SmsRepo;
import com.server.main.user.request.SmsRequest;
import com.server.main.user.response.SmsResponse;

@Service
public class SMSService {

	@Autowired
	public SmsRepo smsRepo;

	public void smsDatabase(SmsRequest smsRequest) {
		SmsResponse smsResponse = SmsResponse.builder().name(smsRequest.getName()).gender(smsRequest.getGender())
				.phoneNumber(smsRequest.getPhoneNumber()).status(smsRequest.isStatus()).build();

		smsRepo.save(smsResponse);
	}

}
