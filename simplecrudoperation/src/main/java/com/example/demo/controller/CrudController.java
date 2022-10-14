package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CrudResponseDto;
import com.example.demo.service.CrudService;

@RestController
public class CrudController {

	CrudService crudService;

	@PostMapping("/save")
	public ResponseEntity<String> saveMethod(@RequestBody  CrudResponseDto CrudResponseDto) {
		crudService.serviceSaveMethod(CrudResponseDto);
		return new ResponseEntity<>("Data Saved Successfully !!!!", HttpStatus.OK);
	}

}
