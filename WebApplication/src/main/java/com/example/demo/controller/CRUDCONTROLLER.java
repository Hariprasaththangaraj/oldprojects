package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CRUDCONTROLLER {

	@GetMapping(value = "name")
	public String basicget(Model model) {

		 model.addAttribute("StringName", "Hellow ");
		 return "name";

	}

}
