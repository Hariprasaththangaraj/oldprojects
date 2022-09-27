package com.server.main.user.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.context.junit4.SpringRunner;

import com.server.main.user.controller.JResult;
import com.server.main.user.controller.ResultResponse;

@RunWith(SpringRunner.class)
@ExtendWith(MockitoExtension.class)
class ServiceTestMethod {

	@InjectMocks
	private ApplicationService applicationService;

	@Mock
	private ResultResponse resultResponse;

	@Mock
	private JResult jResult;

	@Test
	void testcaseforadd() {
		ResultResponse result = applicationService.add(1, 1);
		assertEquals(2, result.getResult());
	}

	
	@Test
	void testcasforaddition() throws RuntimeException {
		ResultResponse result = applicationService.addition(new JResult(2, 2));
		// positive
		assertEquals(4, result.getResult());

		// Negative // doubt
		// assertThrows(additionException.class, () -> new
		// additionException(HttpStatus.BAD_REQUEST, "VALUE NULL AH KUDUKATHINGA"));
	}

	@Test
	void testcasforsubtraction() {
		ResultResponse result = applicationService.subtraction(new JResult(6, 2));
		assertEquals(4, result.getResult());
	}

	
	@Test
	void tescasefordivision() {
		ResultResponse result = applicationService.division(new JResult(6, 3));
		assertEquals(2, result.getResult());
	}

	
	@Test
	void tescaseformulitiplication() {
		ResultResponse result = applicationService.mulitiplication(new JResult(6, 3));
		assertEquals(18, result.getResult());
	}

}