package com.server.main.user.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.server.main.user.bean.developerdetails;
import com.server.main.user.bean.teamDetails;
import com.server.main.user.repository.DAORepository;
import com.server.main.user.requestBean.JsonTeamRequest;
import com.server.main.user.requestBean.developerDetailRequest;

@Service
public class teamservice {

	@Autowired
	DAORepository daoRepository;

	public teamDetails teamservicemethod(@RequestBody JsonTeamRequest TeamDetails) {

		teamDetails TeamDetails1 = new teamDetails();
		TeamDetails1.setTeamName(TeamDetails.getTeamName());
		List<developerDetailRequest> details = TeamDetails.getDeveloperDetailRequest();
		List<developerdetails> developerDetailsList = details.stream().map(details2 -> {
			developerdetails de = new developerdetails();
			de.setName(details2.getName());
			de.setPhoneNumber(details2.getPhoneNumber());
			return de;
		}).collect(Collectors.toList());

		TeamDetails1.setDevelopers(developerDetailsList);

		return daoRepository.save(TeamDetails1);

	}
	
	}
