package com.server.main.user;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.main.user.controller.EmailController;
import com.server.main.user.exception.Constant;
import com.server.main.user.exception.EmailException;
import com.server.main.user.request.Emailrequest;
import com.server.main.user.service.EmailService;

@WebMvcTest(EmailController.class)
@RunWith(SpringJUnit4ClassRunner.class)
class FreshNFreshEmailApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private EmailService emailService;

	@Autowired
	private EmailController emailController;

	@Autowired
	private ObjectMapper objectMapper;

	@Test
	void contextLoads() throws Exception {

		// Emailrequest emailrequest1 = Mockito.mock(Emailrequest.class);

		// doNothingwhen(emailController.emailrequest(emailrequest1)).thenReturn(null);

		// First we need to mock the service class(third party class/bean)
		doNothing().when(emailService).sendEmail(Mockito.any(Emailrequest.class));
		// We need to pass the request and call the method
		mockMvc.perform(
				MockMvcRequestBuilders.post("/email").contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsBytes(new Emailrequest("hariprasaththangaraj@gmail.com",
								"Mail From Spring boot", "Kathuthla paravai vantha odidum"))))
				.andExpect(status().isOk());

	}
	
	
	@Test
	void shouldThrowEmailExceptionForInvalidEmailId() throws Exception {


		// First we need to mock the service class(third party class/bean)
		doThrow( new EmailException(Constant.MESSAGE_STRING, HttpStatus.NO_CONTENT,"1001")).when(emailService).sendEmail(Mockito.any(Emailrequest.class));

		// We need to pass the request and call the method
		mockMvc.perform(
				MockMvcRequestBuilders.post("/email").contentType(MediaType.APPLICATION_JSON)
						.content(objectMapper.writeValueAsBytes(new Emailrequest(" ",
								"Mail From Spring boot", "Kathuthla paravai vantha odidum"))))
				.andExpect(status().isNoContent());

	}

}
