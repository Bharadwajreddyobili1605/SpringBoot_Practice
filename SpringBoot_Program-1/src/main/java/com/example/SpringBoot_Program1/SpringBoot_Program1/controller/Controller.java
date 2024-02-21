package com.example.SpringBoot_Program1.SpringBoot_Program1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("hello")
	public String welcomeUser()
	{
		return "I am learing SpringBoot";
	}

}
