package com.server.main.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.server.main.user.exception.Constant;
import com.server.main.user.exception.EmailException;
import com.server.main.user.request.Emailrequest;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail(@RequestBody Emailrequest emailrequest) throws EmailException {

		SimpleMailMessage message = new SimpleMailMessage();

		if (emailrequest.getEmailid().isEmpty() || emailrequest.getEmailid().isBlank()) {
			throw new EmailException(Constant.MESSAGE_STRING, HttpStatus.NO_CONTENT,"1001");
		}

		message.setTo(emailrequest.getEmailid());

		message.setSubject(emailrequest.getSubject());

		message.setText(emailrequest.getBody());

		javaMailSender.send(message);

	}

}
