package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMakeController {
	
	
	
	@GetMapping("/vehiclemakes")
	public String getCountries()	{
		return "VehicleMake";
	}
}