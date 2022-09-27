package com.server.main.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.server.main.user.entity.PatientDetails;
import com.server.main.user.entity.message;
import com.server.main.user.repo.patientRepo;

@Service
public class patientService {

	@Autowired
	public patientRepo PatientRepo;

	public message patientServicemethod(PatientDetails patientDetails) throws Exception {
		try {
			patientDetails.getPatient_name().isEmpty();
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}

		PatientDetails result = PatientRepo.save(patientDetails);
		message Message = new message();
		Message.setDisply(Message.getDisply());
		return Message;
	}

}
