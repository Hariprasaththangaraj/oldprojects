package com.server.main.user.StudentResponseModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AcademicId {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer academicId;
	private String acadamicYear;
	@Enumerated(EnumType.STRING)
	private Medium medium;
	@OneToOne(cascade = {CascadeType.ALL})
	private SubjectId subjectId;
	@Enumerated(EnumType.STRING)
	private Standard standard;
	@Enumerated(EnumType.STRING)
	private Term term;	
	
}
