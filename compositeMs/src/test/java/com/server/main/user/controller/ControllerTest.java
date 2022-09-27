package com.server.main.user.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.main.user.bean.JResponse;
import com.server.main.user.service.UserService;

@WebMvcTest(UserController.class)
public class ControllerTest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private UserService userService;

	private static final ObjectMapper mapper = new ObjectMapper();

	@Test
	void testforadd() throws JsonProcessingException, Exception {

		JResponse jResponse= new JResponse(2);
		
		when(userService.perform(Mockito.any())).thenReturn(jResponse);

		// Positive
		this.mockMvc.perform(
				post("/api/v1/perform").contentType(MediaType.APPLICATION_JSON).content(mapper.writeValueAsBytes(new JResponse(2))))
				.andExpect(status().isOk());

		// Negative
		this.mockMvc.perform(post("/api/v1/perform")).andExpect(status().isUnsupportedMediaType());
	}
}
