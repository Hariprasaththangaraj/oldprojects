package com.server.main.user.DAORepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.StudentResponseModel.AcademicId;
import com.server.main.user.StudentResponseModel.StudentDetails;
import com.server.main.user.StudentResponseModel.Term;

@Repository
public interface StudentRepo extends JpaRepository<StudentDetails, Integer> {

		
	List<StudentDetails> findByAcademicidAcademicIdAndAcademicidAcadamicYearAndAcademicidTerm(Integer id
			,String year , Term term);
	
}

