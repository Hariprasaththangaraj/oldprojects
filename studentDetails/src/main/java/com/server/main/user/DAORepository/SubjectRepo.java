package com.server.main.user.DAORepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.StudentResponseModel.SubjectId;

@Repository
public interface SubjectRepo extends JpaRepository<SubjectId, Integer>{

}
