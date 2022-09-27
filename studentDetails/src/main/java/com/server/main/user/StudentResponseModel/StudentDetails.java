package com.server.main.user.StudentResponseModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StudentDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer studentId;
	private String studentName;	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	private String schoolName;
	@OneToOne(cascade = {CascadeType.ALL})
	private AddressID addressID;
	@Enumerated(EnumType.STRING)
	private BoardId boardId;
	private Boolean active;
	@OneToOne(cascade = {CascadeType.ALL})
	private AcademicId academicid;
	
	}
