package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
	
	
	
	@GetMapping("/users")
	public String getCountries()	{
		return "User";
	}
}
