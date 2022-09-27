package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MVCcontroller {
	
	@RequestMapping
	public String display() {
		return "Hellow World";
	}

}
