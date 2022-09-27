package com.server.main.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.main.user.entity.PatientDetails;

@Repository
public interface patientRepo extends JpaRepository<PatientDetails, Integer>{

}
