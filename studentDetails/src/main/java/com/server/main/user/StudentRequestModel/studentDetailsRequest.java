package com.server.main.user.StudentRequestModel;

import com.server.main.user.StudentResponseModel.AcademicId;
import com.server.main.user.StudentResponseModel.AddressID;
import com.server.main.user.StudentResponseModel.BoardId;
import com.server.main.user.StudentResponseModel.Gender;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class studentDetailsRequest {



	private Integer studentId;
	private String studentName;	
	private Gender gender;
	private String schoolName;
	private AddressID addressID;
	private BoardId boardId;
	private Boolean active;
	private AcademicId academicid;
}