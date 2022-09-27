package com.server.main.user.service;

import static org.junit.Assert.assertThrows;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import com.server.main.user.exception.EmailException;
import com.server.main.user.request.Emailrequest;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class EmailServiceTest {

	@InjectMocks
	private EmailService emailService;

	@Mock
	private JavaMailSender javaMailSender;

	@Test
	public void throwExceptionforinvalidEmailid() {

		assertThrows(EmailException.class, () -> emailService
				.sendEmail(new Emailrequest("", "Mail From Spring boot", "Kathuthla paravai vantha odidum")));

	}
}
