package com.server.main.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.server.main.user.bean.teamDetails;
import com.server.main.user.requestBean.JsonTeamRequest;
import com.server.main.user.requestBean.developerDetailRequest;
import com.server.main.user.service.teamservice;

@RestController
public class teamcontroller {

	@Autowired
	private teamservice Teamservice;

	@PostMapping("/team")
	public ResponseEntity<teamDetails> teamdetails(@RequestBody JsonTeamRequest TeamDetails) {
		teamDetails result = Teamservice.teamservicemethod(TeamDetails);
		return new ResponseEntity<>(result, HttpStatus.ACCEPTED);
	}
	
	

}
