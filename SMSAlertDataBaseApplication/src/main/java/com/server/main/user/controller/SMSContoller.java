package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.request.SmsRequest;
import com.server.main.user.service.SMSService;

@RestController
public class SMSContoller {

	@Autowired
	public SMSService sMSService;

	@PostMapping("/smspost")
	public ResponseEntity<String> smsDatabase(@RequestBody SmsRequest smsRequest) {
		sMSService.smsDatabase(smsRequest);
		return new ResponseEntity<>("Data Saved", HttpStatus.OK);

	}
	
	@PostMapping
	public ResponseEntity<String> sendSms(@RequestBody SmsRequest smsRequest){
		
		return null;
	}

}
