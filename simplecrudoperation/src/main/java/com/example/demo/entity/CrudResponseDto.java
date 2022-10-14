package com.example.demo.entity;

import java.util.List;
import java.util.Map;

public class CrudResponseDto {

	private List<String> phoneNumber;
	private Map<String, String> name;

	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Map<String, String> getName() {
		return name;
	}

	public void setName(Map<String, String> name) {
		this.name = name;
	}

	public CrudResponseDto(List<String> phoneNumber, Map<String, String> name) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public CrudResponseDto() {

	}

}
