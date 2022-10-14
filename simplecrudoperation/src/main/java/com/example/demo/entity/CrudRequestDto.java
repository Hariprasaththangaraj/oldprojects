package com.example.demo.entity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.context.annotation.Bean;

@Entity
@Table
public class CrudRequestDto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@ElementCollection
	private List<String> phoneNumber;
	@ElementCollection
	private Map<String, String> name = new HashMap<String, String>();

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Bean
	public List<String> getPhoneNumber() {
		return phoneNumber;
	}

	@Bean
	public void setPhoneNumber(List<String> phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Bean
	public Map<String, String> getName() {
		return name;
	}

	@Bean
	public void setName(Map<String, String> name) {
		this.name = name;
	}

	public CrudRequestDto(Integer id, List<String> phoneNumber, Map<String, String> name) {
		super();
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.name = name;
	}

	public CrudRequestDto() {

	}

}
