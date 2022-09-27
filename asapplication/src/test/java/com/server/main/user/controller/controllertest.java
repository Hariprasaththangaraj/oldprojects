package com.server.main.user.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.main.user.service.ApplicationService;

@WebMvcTest(ApplicationController.class)
class controllertest {

	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private ApplicationService applicationService;

	@Autowired
	private ApplicationController applicationController;

	private static final ObjectMapper mapper = new ObjectMapper();

	@Test
	void testforaddition() throws JsonProcessingException, Exception {

		when(applicationService.add(Mockito.anyInt(), Mockito.anyInt())).thenReturn(new ResultResponse());

		// checking positive scenario
		this.mockMvc.perform(post("/add/1/2")).andExpect(status().isOk());
	}

	@Test
	void testforadd() throws Exception {
		when(applicationService.addition(Mockito.any())).thenReturn(new ResultResponse());

		// checking positive scenario
		this.mockMvc.perform(post("/addition").contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsBytes(new ResultResponse()))).andExpect(status().isAccepted());

		// checking negative scenario
		this.mockMvc.perform(post("/addition")).andExpect(status().isBadRequest());
	}

	@Test
	void testsubtraction() throws Exception {
		when(applicationService.subtraction(Mockito.any())).thenReturn(new ResultResponse());

		// checking positive scenario
		this.mockMvc.perform(post("/subtraction").contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsBytes(new ResultResponse()))).andExpect(status().isAccepted());

		// checking negative scenario
		this.mockMvc.perform(post("/subtraction")).andExpect(status().isBadRequest());
	}

	@Test
	void testdivisionmethod() throws JsonProcessingException, Exception {
		when(applicationService.division(Mockito.any())).thenReturn(new ResultResponse());
		
		// checking negative scenario
		this.mockMvc.perform(post("/Division")).andExpect(status().isBadRequest());

		//checking positive scenario
		this.mockMvc.perform((post("/Division").contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsBytes(new ResultResponse())))).andExpect(status().isAccepted());
	}
	
	@Test
	void testmultiplication() throws JsonProcessingException, Exception {
		when(applicationService.mulitiplication(Mockito.any())).thenReturn(new ResultResponse());
		
		// checking negative scenario
		this.mockMvc.perform(post("/Multiplication").contentType(MediaType.APPLICATION_JSON)
				.content(mapper.writeValueAsBytes(new ResultResponse()))).andExpect(status().isAccepted());
				
				this.mockMvc.perform(post("/Multiplication")).andExpect(status().isBadRequest());
	}
}
