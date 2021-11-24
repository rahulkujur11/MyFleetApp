package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
	
	
	
	@GetMapping("/clients")
	public String getCountries()	{
		return "Client";
	}
}
