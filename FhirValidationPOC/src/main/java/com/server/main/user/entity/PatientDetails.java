package com.server.main.user.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer patient_Id;
	
	@NotBlank(message = "Name may not be null")
	@NotEmpty(message = "Name may not be null")
	private String patient_name;
	private Long patient_phno;
}
