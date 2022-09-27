package com.server.main.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.StudentRequestModel.studentDetailsRequest;
import com.server.main.user.StudentResponseModel.AcademicId;
import com.server.main.user.StudentResponseModel.StudentDetails;
import com.server.main.user.StudentResponseModel.Term;
import com.server.main.user.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	public StudentService studentService;
	
	Logger logger = LoggerFactory.getLogger(StudentController.class);

	@PostMapping("v1/student")
	public ResponseEntity<StudentDetails> studentPostMethod(@RequestBody studentDetailsRequest studentdetailsRequest) {
		logger.info("POST API TRIGGERED");
		StudentDetails savedStudentdetails = studentService.savestudentdetails(studentdetailsRequest);
		return new ResponseEntity<>(savedStudentdetails, HttpStatus.ACCEPTED);
	}

	@PutMapping("v1/student/update/{id}")
	public ResponseEntity<StudentDetails> updateStudentDetails(@RequestBody studentDetailsRequest studentdetailsRequest,
			@PathVariable("id") Integer getId) {
		logger.info("PUT - UPDATED STUDENT API TRIGGERED");
		StudentDetails updatedStudentDetails = studentService.updateteamdetails(studentdetailsRequest, getId);
		return new ResponseEntity<>(updatedStudentDetails, HttpStatus.OK);
	}

	@GetMapping("v1/getstudent/{id}")
	public ResponseEntity<StudentDetails> getStudentDetailsByid(@PathVariable("id") Integer getId) {
		logger.info("GET - GET STUDENT DETIALS BY ID API TRIGGERED");
		StudentDetails studentDetialsById = studentService.checkStudentDatabaseByID(getId);
		return new ResponseEntity<>(studentDetialsById, HttpStatus.FOUND);
	}

	@GetMapping("v1/getstudent/{id}/{year}/{term}")
	public ResponseEntity<List<AcademicId>> getStudentDetailsByidyearAndterm(@PathVariable("id") Integer academicId,
			@PathVariable("year") String acadamicYear, @PathVariable("term") Term term) {
		logger.info("GET - GET STUDENT DETAILS BY ID AND YEAR API TRIGGERED");

		List<AcademicId> studentDB = studentService.checkStudentDatabaseByIdYearTerm(academicId, acadamicYear, term);
		return new ResponseEntity<>(studentDB, HttpStatus.OK);
	}

	@DeleteMapping("v1/student/delete/{id}")
	public ResponseEntity<String> deleteStudentDetails(@PathVariable("id") Integer getId) {
		logger.info("DELETE - DELETE STUDENT DETAILS API TRIGGERED");
		studentService.deleteStudentdetails(getId);
		return new ResponseEntity<>("STUDENT RECORD HAS BEEN MOVED TO INACTIVE !!!", HttpStatus.ACCEPTED);

	}
}
