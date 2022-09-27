package com.server.main.user.service;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.server.main.user.controller.JResult;
import com.server.main.user.controller.ResultResponse;
import com.server.main.user.exception.additionException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ApplicationService {

	public ResultResponse add(int firstnum, int secondnum) {
		int result = firstnum + secondnum;
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(result);
		return resultResponse;
	}

	public ResultResponse addition(@RequestBody JResult jResult) {

		log.debug("Addition Method started..");
		if (jResult.getFnum() == null || jResult.getSnum() == null) {
            log.error("Values should not be null");
			throw new additionException(HttpStatus.BAD_REQUEST, "VALUE NULL AH KUDUKATHINGA");
		}

		if (jResult.getFnum() <= 0 || jResult.getSnum() <= 0)
			throw new additionException(HttpStatus.BAD_REQUEST, "VALUE 0 KU MELA KUDUNGA");

		log.info("First num : {} , second number: {} ",jResult.getFnum(),jResult.getSnum());
		int result = jResult.getFnum() + jResult.getSnum();

		ResultResponse JREsult = new ResultResponse();
		JREsult.setResult(result);
		return JREsult;
	}

	public ResultResponse subtraction(@RequestBody JResult jResult) {

		if (jResult.getFnum() < jResult.getSnum())
			throw new additionException(HttpStatus.BAD_REQUEST, "MORE THEN");

		int result = jResult.getFnum() - jResult.getSnum();

		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(result);
		return resultResponse;
	}

	public ResultResponse division(@RequestBody JResult jResult) {

		if (jResult.getFnum() < jResult.getSnum())
			throw new additionException(HttpStatus.BAD_REQUEST, "MORE THEN FOR DIVISION");
		
		if (jResult.getFnum() == 0 || jResult.getSnum() == 0) {
			log.error("Should not be Zero!!");
			throw new additionException(HttpStatus.BAD_REQUEST, "NO 0");
		}
		

		int result = jResult.getFnum() / jResult.getSnum();
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(result);
		return resultResponse;
	}

	public ResultResponse mulitiplication(@RequestBody JResult jResult) {

		if (jResult.getFnum() == 0 || jResult.getSnum() == 0)
			throw new additionException(HttpStatus.BAD_REQUEST, "NO 0");

		int result = jResult.getFnum() * jResult.getSnum();
		ResultResponse resultResponse = new ResultResponse();
		resultResponse.setResult(result);
		return resultResponse;
	}

}
