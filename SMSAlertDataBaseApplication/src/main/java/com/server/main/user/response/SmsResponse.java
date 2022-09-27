package com.server.main.user.response;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Table
@Entity
@Builder
public class SmsResponse {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer sNo;
	private String name;
	private double phoneNumber;
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private boolean status;	
}
