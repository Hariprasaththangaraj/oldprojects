package com.server.main.user.requestDTO;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.server.main.user.responseDTO.Gender;

public class SignUpRequest {

	private String name;
	private String emailId;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private Long phoneNumber;
	private String passWord;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

}
