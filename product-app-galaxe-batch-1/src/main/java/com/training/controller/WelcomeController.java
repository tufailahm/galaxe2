package com.training.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class WelcomeController {

	public WelcomeController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping
	public String getMessage() {
		return "Hi Akshay";
	}

	@GetMapping("welcome")		//localhost:9090/welcome
	public String home() {
		return "Hi Tufail";
	}
	 
}

/*
http://localhost:9090/	- <YOUR NAME>
http://localhost:9090/welcome	- WELCOME TO GALAXE
http://localhost:9090/hi/welcome	- WELCOME TO HI APP
*/