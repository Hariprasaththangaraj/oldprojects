package com.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.category.model.CategoryRequest;
import com.category.model.Response;
import com.category.service.CategoryEmailSrvc;

@RestController
public class CategoryEmailController {

	@Autowired
	private CategoryEmailSrvc categoryEmailSrvc;
	
	@PostMapping("/sendmail")
	public ResponseEntity<Response> categoryEmail(@RequestBody CategoryRequest categoryRequest) throws Exception 
	{
		return new ResponseEntity<Response>(categoryEmailSrvc.categoryEmail(categoryRequest), HttpStatus.OK);
	}
}
