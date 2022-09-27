package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.entity.PatientDetails;
import com.server.main.user.entity.message;
import com.server.main.user.service.patientService;

@RestController
public class patientController {
	
	@Autowired
	public patientService PatientService;
	
	@PostMapping("/patient")
	public ResponseEntity<message> patientresponse(@RequestBody PatientDetails patientDetails) throws Exception{
		message service = PatientService.patientServicemethod(patientDetails);	
		return new ResponseEntity<>(service,HttpStatus.ACCEPTED);	
	}

}
