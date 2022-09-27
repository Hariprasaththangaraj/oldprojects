package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.request.Emailrequest;
import com.server.main.user.request.Emailresponse;
import com.server.main.user.service.EmailService;

@RestController
public class EmailController {

	@Autowired
	private EmailService emailService;

	@PostMapping("/email")
	public ResponseEntity<Emailresponse> emailrequest(@RequestBody Emailrequest emailrequest) {
		emailService.sendEmail(emailrequest);
		Emailresponse otherresponse = new Emailresponse();
		return new ResponseEntity<>(otherresponse, HttpStatus.OK);
	}
}
