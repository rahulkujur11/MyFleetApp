package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LocationController {
	
	
	
	@GetMapping("/locations")
	public String getCountries()	{
		return "Location";
	}
}
