package com.server.main.user.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.server.main.user.bean.JMultiplyResult;
import com.server.main.user.bean.JRequest;
import com.server.main.user.bean.JResponse;
import com.server.main.user.bean.JResult;
import com.server.main.user.bean.ResultMultiplyResponse;
import com.server.main.user.bean.ResultResponse;
import com.server.main.user.exception.ExceptionCalculation;

@Service
public class UserService {

	@Autowired
	RestTemplate restTemplate;
	
	
	@Autowired
	RestClient restClient;

	private int add(int firstnum, int secondnum) {
		JResult jresult = new JResult();
		jresult.setFnum(firstnum);
		jresult.setSnum(secondnum);

		ResultResponse result = restTemplate.postForObject("http://localhost:8081/addition", jresult,
				ResultResponse.class);

		return result.getResult();

	}

	private int sub(int firstnum, int secondnum) {
		JResult jResult = new JResult();
		jResult.setFnum(firstnum);
		jResult.setSnum(secondnum);

		ResultResponse result = restTemplate.postForObject("http://localhost:8081/subtraction", jResult,
				ResultResponse.class);

		return result.getResult();
	}

	private int multiply(int firstnum, int secondnum) {

		JMultiplyResult jMultiplyResult = new JMultiplyResult();
		jMultiplyResult.setFnum(firstnum);
		jMultiplyResult.setSnum(secondnum);

		ResultMultiplyResponse result = restTemplate.postForObject("http://localhost:8081/Multiplication",
				jMultiplyResult, ResultMultiplyResponse.class);

		return result.getResult();
	}

	private int divide(int firstnum, int secondnum) {
		JMultiplyResult JdivideResult = new JMultiplyResult();
		JdivideResult.setFnum(firstnum);
		JdivideResult.setSnum(secondnum);

		ResultMultiplyResponse result = restTemplate.postForObject("http://localhost:8081/Division", JdivideResult,
				ResultMultiplyResponse.class);

		return result.getResult();
	}

	public JResponse perform(@RequestBody JRequest jRequest) throws RuntimeException {

		if (jRequest.getAddFirstnum() == 0 || jRequest.getAddSecondnum() == 0)
			throw new ExceptionCalculation("PLEASE CHECK THE NUMBER", HttpStatus.BAD_REQUEST);

		if (jRequest.getSubFristnum() < jRequest.getSubSecondnum() || jRequest.getSubFristnum() == 0
				|| jRequest.getSubSecondnum() == 0)
			throw new ExceptionCalculation("INVALID NUMBER", HttpStatus.BAD_REQUEST);

		int addresult = add(jRequest.getAddFirstnum(), jRequest.getAddSecondnum());

		int subResult = sub(jRequest.getSubFristnum(), jRequest.getSubSecondnum());

		int multiplyResult = multiply(jRequest.getMultiplyFirstnum(), jRequest.getMultiplySecondnum());

		int divideResult = divide(jRequest.getDivideFirstnum(), jRequest.getDivideSecondnum());

		int choice = jRequest.getPerForm();

		switch (choice) {

		case 1:
			choice = add((addresult + subResult), (multiplyResult + divideResult));
			break;

		case 2:
			if (addresult < subResult)
				throw new ExceptionCalculation("FRIST NUMBER SHOULD BE GREATER THAN SECOND NUMBER",
						HttpStatus.BAD_REQUEST);
			choice = sub((addresult - subResult), (multiplyResult - divideResult));
			break;

		case 3:
			if (addresult < subResult)
				throw new ExceptionCalculation("FRIST NUMBER SHOULD BE GREATER THAN SECOND NUMBER",
						HttpStatus.BAD_REQUEST);
			choice = divide((addresult / subResult), (multiplyResult / divideResult));
			break;

		case 4:
			choice = multiply((addresult * subResult), (multiplyResult * divideResult));
			break;

		// doubt
		default:
			if (choice < 4)
				throw new ExceptionCalculation("PLEASE SELECT APPROPRIATE OPTION",
						HttpStatus.BAD_REQUEST);
			choice = Integer.parseInt("PLEASE SELECT APPROPRIATE OPTION");
		}

		return new JResponse(choice);
	}

	private int newadd(int firstnum, int secondnum) {
		JResult jresult = new JResult();
		jresult.setFnum(firstnum);
		jresult.setSnum(secondnum);

		org.springframework.http.HttpHeaders httpHeaders = new org.springframework.http.HttpHeaders();
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity<JResult> httpEntity = new HttpEntity<>(jresult, httpHeaders);

		try {
			ResponseEntity<JResponse> response = restTemplate.exchange("http://localhost:8081/addition",
					HttpMethod.POST, httpEntity, JResponse.class);

			return response.getBody().getResult();
		} catch (Exception e) {
			throw new ExceptionCalculation(e.getLocalizedMessage(), HttpStatus.BAD_GATEWAY);
		}
	}

	private int newsub(int firstnum, int secondnum) {
		JResult jresult = new JResult();
		jresult.setFnum(firstnum);
		jresult.setSnum(secondnum);

		HttpHeaders httpHeaders = new HttpHeaders();

		HttpEntity<JResult> httpEntity = new HttpEntity<>(jresult, httpHeaders);

		try {
			ResponseEntity<JResponse> response = restTemplate.exchange("http://localhost:8081/subtraction",
					HttpMethod.POST, httpEntity, JResponse.class);

			return response.getBody().getResult();
		} catch (Exception ex) {
			throw new ExceptionCalculation(ex.getLocalizedMessage(), HttpStatus.BAD_GATEWAY);
		}
	}

	private int newmultiply(int firstnum, int secondnum) {

		JResult jresult = new JResult();
		jresult.setFnum(firstnum);
		jresult.setSnum(secondnum);

		HttpHeaders httpHeaders = new HttpHeaders();

		HttpEntity<JResult> httpEntity = new HttpEntity<>(jresult, httpHeaders);

		try {
			ResponseEntity<JResponse> response = restTemplate.exchange("http://localhost:8081/Multiplication",
					HttpMethod.POST, httpEntity, JResponse.class);

			return response.getBody().getResult();
		} catch (Exception e) {
			throw new ExceptionCalculation(e.getLocalizedMessage(), HttpStatus.BAD_GATEWAY);
		}
	}

	private int newdivision(int firstnum, int secondnum) {
		JResult jresult = new JResult();
		jresult.setFnum(firstnum);
		jresult.setSnum(secondnum);

		try {
			
			JResponse responseData= restClient.restPost("http://localhost:8081/Division", jresult, JResponse.class);
			return responseData.getResult();
		} catch (Exception e) {
			throw new ExceptionCalculation(e.getLocalizedMessage(), HttpStatus.BAD_GATEWAY);
		}

	}

	public JResponse newperform(@RequestBody JRequest jRequest) {

		int newaddresult = newadd(jRequest.getAddFirstnum(), jRequest.getAddSecondnum());

		int newsubresult = newsub(jRequest.getSubFristnum(), jRequest.getSubSecondnum());

		int newmultiplyresult = newmultiply(jRequest.getMultiplyFirstnum(), jRequest.getMultiplySecondnum());

		int newdivisionresult = newdivision(jRequest.getDivideFirstnum(), jRequest.getDivideSecondnum());

		int choice = jRequest.getPerForm();

		if (newaddresult == 0 || newsubresult == 0 || newmultiplyresult == 0 || newdivisionresult == 0)
			throw new ExceptionCalculation("PLEASE ENTER THE VALID NUMBER FOR NEW PERFORMANCE", HttpStatus.BAD_REQUEST);

		switch (choice) {

		case 1:
			choice = newadd((newaddresult + newsubresult), (newmultiplyresult + newdivisionresult));
			break;

		case 2:
			choice = newsub((newaddresult - newsubresult), (newmultiplyresult - newdivisionresult));
			break;

		case 3:
			choice = newmultiply((newaddresult * newsubresult), (newmultiplyresult * newdivisionresult));
			break;

		case 4:
			choice = newdivision((newaddresult / newsubresult), (newmultiplyresult / newdivisionresult));
			break;

		default:
			if (choice < 4)
				throw new ExceptionCalculation("FRIST NUMBER SHOULD BE GREATER THAN SECOND NUMBER",
						HttpStatus.BAD_REQUEST);
			choice = Integer.parseInt("PLEASE SELECT APPROPRIATE OPTION");
		}

		return new JResponse(choice);
	}

}
