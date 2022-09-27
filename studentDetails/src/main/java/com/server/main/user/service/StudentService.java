package com.server.main.user.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.server.main.user.DAORepository.AcadamicRepo;
import com.server.main.user.DAORepository.StudentRepo;
import com.server.main.user.StudentRequestModel.studentDetailsRequest;
import com.server.main.user.StudentResponseModel.AcademicId;
import com.server.main.user.StudentResponseModel.AddressID;
import com.server.main.user.StudentResponseModel.StudentDetails;
import com.server.main.user.StudentResponseModel.SubjectId;
import com.server.main.user.StudentResponseModel.Term;
import com.server.main.user.serviceAdvice.GlobalExceptionHandler;

@Service
public class StudentService {

	@Autowired
	public StudentRepo studentRepo;

	@Autowired
	public AcadamicRepo acadamicRepo;

	Logger logger = LoggerFactory.getLogger(StudentService.class);

	// Validation
	public StudentDetails savestudentdetails(studentDetailsRequest studentdetailsRequest) {
		logger.info("Save Student Details service triggered");
		StudentDetails studentDetails = StudentDetails.builder().studentName(studentdetailsRequest.getStudentName())
				.gender(studentdetailsRequest.getGender()).schoolName(studentdetailsRequest.getSchoolName())
				.addressID(studentdetailsRequest.getAddressID()).academicid(studentdetailsRequest.getAcademicid())
				.boardId(studentdetailsRequest.getBoardId()).active(studentdetailsRequest.getActive()).build();
		return studentRepo.save(studentDetails);
	}

	public StudentDetails updateteamdetails(studentDetailsRequest studentdetailsRequest, Integer getId) {
		logger.info("Update Details service triggered");
		StudentDetails findStudentId = studentDetailsInDatabase(studentdetailsRequest, getId);
		return studentRepo.save(findStudentId);
	}

	public void deleteStudentdetails(Integer getId) {
		logger.info("Delete Details service triggered");
		Optional<StudentDetails> studentIdDetails = studentRepo.findById(getId);
		StudentDetails studentIsdetail = studentIdDetails.get();
		if (studentIsdetail.getActive() == false) {
			throw new GlobalExceptionHandler("Student Status is Already inActive!!!", HttpStatus.BAD_REQUEST);
		}
		studentIsdetail.setActive(false);
		studentRepo.save(studentIsdetail);
	}

	// create method for delete - ID and year

	public StudentDetails studentDetailsInDatabase(studentDetailsRequest studentdetailsRequest, Integer getId) {
		logger.info("Student DB Details service triggered");
		StudentDetails studentDetails = checkStudentDatabase(getId);

		studentDetails.setStudentName(studentdetailsRequest.getStudentName());
		studentDetails.setGender(studentdetailsRequest.getGender());
		studentDetails.setSchoolName(studentdetailsRequest.getSchoolName());
		studentDetails.setActive(studentdetailsRequest.getActive());
		studentDetails.setBoardId(studentdetailsRequest.getBoardId());

		AddressID studentAddress = studentDetails.getAddressID();
		studentAddress.setCity(studentdetailsRequest.getAddressID().getCity());
		studentAddress.setDoorNo(studentdetailsRequest.getAddressID().getDoorNo());
		studentAddress.setState(studentdetailsRequest.getAddressID().getState());
		studentAddress.setStreet(studentdetailsRequest.getAddressID().getStreet());

		studentDetails.setAddressID(studentAddress);

		AcademicId studentAcadamicDetails = studentDetails.getAcademicid();
		studentAcadamicDetails.setAcadamicYear(studentdetailsRequest.getAcademicid().getAcadamicYear());
		studentAcadamicDetails.setMedium(studentdetailsRequest.getAcademicid().getMedium());
		studentAcadamicDetails.setStandard(studentdetailsRequest.getAcademicid().getStandard());
		studentAcadamicDetails.setTerm(studentdetailsRequest.getAcademicid().getTerm());

		SubjectId studentSubjectDetails = studentDetails.getAcademicid().getSubjectId();
		studentSubjectDetails.setEnglish(studentdetailsRequest.getAcademicid().getSubjectId().getEnglish());
		studentSubjectDetails.setTamil(studentdetailsRequest.getAcademicid().getSubjectId().getTamil());
		studentSubjectDetails.setTotal(studentdetailsRequest.getAcademicid().getSubjectId().getTotal());
		studentAcadamicDetails.setSubjectId(studentSubjectDetails);

		studentDetails.setAcademicid(studentAcadamicDetails);
		return studentDetails;
	}

	public StudentDetails checkStudentDatabase(Integer getID) {
		logger.info("Check Student Details service triggered");
		Optional<StudentDetails> studentDBreturn = studentRepo.findById(getID);
		if (!studentDBreturn.isPresent()) {
			throw new GlobalExceptionHandler("Data not found!!!", HttpStatus.BAD_REQUEST);
		}
		return studentDBreturn.get();
	}

	public StudentDetails checkStudentDatabaseByID(Integer GetId) {
		logger.info("check Student Details by ID service triggered");
		Optional<StudentDetails> studentDetails = studentRepo.findById(GetId);

		StudentDetails studentdetailsDB = studentDetails.get();

		if (!studentdetailsDB.getActive() || !studentDetails.isPresent()) {
			throw new GlobalExceptionHandler("STUDENT ACTIVE STATUS IS FALSE!!!", HttpStatus.BAD_REQUEST);
		} else
			return studentdetailsDB;
	}

	public List<AcademicId> checkStudentDatabaseByIdYearTerm(Integer academicId, String acadamicYear, Term term) {
		logger.info("check Student Details By DB and Year service triggered");

	   List<StudentDetails> dl= studentRepo.findByAcademicidAcademicIdAndAcademicidAcadamicYearAndAcademicidTerm(academicId,acadamicYear,term);
		return null;
	
//		List<AcademicId> acadamicDetails = acadamicRepo.findByAcademicIdAndAcadamicYearAndTerm(academicId, acadamicYear,
//				term);
//		
//		AcademicId academicIds = new AcademicId();	
//		for(AcademicId acadamicDetail  : acadamicDetails){
//		if (!academicId.equals(acadamicDetail.getAcademicId())
//				|| !acadamicYear.equals(acadamicDetail.getAcadamicYear())
//				|| !term.equals(acadamicDetail.getTerm())) {
//			throw new GlobalExceptionHandler("VALUES SHOULD NOT BE NULL/INVALID !!!!", HttpStatus.BAD_REQUEST);
//		}
//		}
//		
//		return acadamicDetails;
	}

}
