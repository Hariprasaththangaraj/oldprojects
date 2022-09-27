package com.server.main.user.service;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;

import javax.net.ssl.SSLEngineResult.Status;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.server.main.user.bean.JMultiplyResult;
import com.server.main.user.bean.JRequest;
import com.server.main.user.bean.JResponse;
import com.server.main.user.bean.JResult;
import com.server.main.user.bean.ResultMultiplyResponse;
import com.server.main.user.bean.ResultResponse;
import com.server.main.user.exception.ExceptionCalculation;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
public class ServiceTest {

	@InjectMocks
	private UserService userService;

	@Autowired
	private MockMvc mockMvc;

	@Mock
	RestTemplate restTemplate;

	private static final ObjectMapper mapper = new ObjectMapper();

	@Test
	void testcaseforadd() {

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(200);
		jRequest.setAddSecondnum(100);
		jRequest.setSubFristnum(8);
		jRequest.setSubSecondnum(2);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(1);

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(300);

		ResultResponse resultResponse1 = new ResultResponse();
		resultResponse1.setResult(6);

		ResultMultiplyResponse resultResponse2 = new ResultMultiplyResponse();
		resultResponse2.setResult(200);

		ResultMultiplyResponse resultResponse3 = new ResultMultiplyResponse();
		resultResponse3.setResult(4);

		ResultResponse resultResponse4 = new ResultResponse();
		resultResponse4.setResult(510);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JResult.class),
				Mockito.eq(ResultResponse.class))).thenReturn(resultResponse, resultResponse1, resultResponse4);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JMultiplyResult.class),
				Mockito.eq(ResultMultiplyResponse.class))).thenReturn(resultResponse2, resultResponse3);

		JResponse result = userService.perform(jRequest);

		assertEquals(510, result.getResult());

	}

	@Test
	void testcaseforexception() {

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(0);
		jRequest.setAddSecondnum(0);
		jRequest.setSubFristnum(8);
		jRequest.setSubSecondnum(2);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(1);

		ExceptionCalculation result = assertThrows(ExceptionCalculation.class, () -> userService.perform(jRequest));

		assertEquals("PLEASE CHECK THE NUMBER", result.getMessage());
	}

	@Test
	void testcasetwo() {

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(3);
		jRequest.setAddSecondnum(2);
		jRequest.setSubFristnum(100);
		jRequest.setSubSecondnum(10);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(2);

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(30);

		ResultResponse resultResponse1 = new ResultResponse();
		resultResponse1.setResult(60);

		ResultMultiplyResponse resultResponse2 = new ResultMultiplyResponse();
		resultResponse2.setResult(200);

		ResultMultiplyResponse resultResponse3 = new ResultMultiplyResponse();
		resultResponse3.setResult(4);

		ResultResponse resultResponse4 = new ResultResponse();
		resultResponse4.setResult(510);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JResult.class),
				Mockito.eq(ResultResponse.class))).thenReturn(resultResponse, resultResponse1);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JMultiplyResult.class),
				Mockito.eq(ResultMultiplyResponse.class))).thenReturn(resultResponse2, resultResponse3);

		assertThrows(ExceptionCalculation.class, () -> userService.perform(jRequest));

	}

	@Test
	void testcasefour() {

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(3);
		jRequest.setAddSecondnum(2);
		jRequest.setSubFristnum(100);
		jRequest.setSubSecondnum(10);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(4);

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(30);

		ResultResponse resultResponse1 = new ResultResponse();
		resultResponse1.setResult(60);

		ResultMultiplyResponse resultResponse2 = new ResultMultiplyResponse();
		resultResponse2.setResult(200);

		ResultMultiplyResponse resultResponse3 = new ResultMultiplyResponse();
		resultResponse3.setResult(4);

		ResultResponse resultResponse4 = new ResultResponse();
		resultResponse4.setResult(510);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JResult.class),
				Mockito.eq(ResultResponse.class))).thenReturn(resultResponse, resultResponse1, resultResponse4);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JMultiplyResult.class),
				Mockito.eq(ResultMultiplyResponse.class))).thenReturn(resultResponse2, resultResponse3);

		JResponse result = userService.perform(jRequest);

		assertEquals(4, result.getResult());
	}

	@Test
	void testcasethree() {

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(3);
		jRequest.setAddSecondnum(2);
		jRequest.setSubFristnum(100);
		jRequest.setSubSecondnum(10);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(3);

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(30);

		ResultResponse resultResponse1 = new ResultResponse();
		resultResponse1.setResult(60);

		ResultMultiplyResponse resultResponse2 = new ResultMultiplyResponse();
		resultResponse2.setResult(200);

		ResultMultiplyResponse resultResponse3 = new ResultMultiplyResponse();
		resultResponse3.setResult(4);

		ResultResponse resultResponse4 = new ResultResponse();
		resultResponse4.setResult(510);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JResult.class),
				Mockito.eq(ResultResponse.class))).thenReturn(resultResponse, resultResponse1);

		when(restTemplate.postForObject(Mockito.anyString(), Mockito.any(JMultiplyResult.class),
				Mockito.eq(ResultMultiplyResponse.class))).thenReturn(resultResponse2, resultResponse3);

		assertThrows(ExceptionCalculation.class, () -> userService.perform(jRequest));

	}

	@Test
	void testcasefornewadd() throws JsonProcessingException, Exception {

		JResponse jResponse = new JResponse(2);

		JRequest jRequest = new JRequest();
		jRequest.setAddFirstnum(3);
		jRequest.setAddSecondnum(2);
		jRequest.setSubFristnum(100);
		jRequest.setSubSecondnum(10);
		jRequest.setMultiplyFirstnum(50);
		jRequest.setMultiplySecondnum(4);
		jRequest.setDivideFirstnum(8);
		jRequest.setDivideSecondnum(2);
		jRequest.setPerForm(3);

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(30);

		ResultResponse resultResponse1 = new ResultResponse();
		resultResponse1.setResult(60);

		ResultMultiplyResponse resultResponse2 = new ResultMultiplyResponse();
		resultResponse2.setResult(200);

		ResultMultiplyResponse resultResponse3 = new ResultMultiplyResponse();
		resultResponse3.setResult(4);

		ResultResponse resultResponse4 = new ResultResponse();
		resultResponse4.setResult(510);
	
		
		when(restTemplate.exchange(Mockito.anyString(), Mockito.eq(HttpMethod.POST), Mockito.any(HttpEntity.class),
				Mockito.eq(JResponse.class))).thenReturn(new ResponseEntity<>(jResponse, HttpStatus.OK));

		JResponse result = userService.newperform(jRequest);
		
		assertEquals(2, result.getResult()); 
	}

}
