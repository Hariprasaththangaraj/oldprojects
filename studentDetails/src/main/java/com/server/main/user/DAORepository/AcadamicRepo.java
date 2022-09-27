package com.server.main.user.DAORepository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.StudentResponseModel.AcademicId;
import com.server.main.user.StudentResponseModel.Term;

@Repository
public interface AcadamicRepo extends JpaRepository<AcademicId, Integer> {

	List<AcademicId> findByAcademicIdAndAcadamicYearAndTerm(Integer academicId, String acadamicYear, Term term);

}
