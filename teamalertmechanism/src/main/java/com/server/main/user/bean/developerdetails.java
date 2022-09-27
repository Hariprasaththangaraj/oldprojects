package com.server.main.user.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class developerdetails {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer developerId;
	private String name;
	private Long phoneNumber;

	
}
