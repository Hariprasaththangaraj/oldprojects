package com.server.main.user.request;

import com.server.main.user.response.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	
	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	public class SmsRequest {	

		private Integer sNo;
		private String name;
		private double phoneNumber;
		private Gender gender;
		private boolean status;	
	}



