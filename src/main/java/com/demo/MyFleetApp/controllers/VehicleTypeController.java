package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {
	
	
	
	@GetMapping("/vehicletypes")
	public String getCountries()	{
		return "VehicleType";
	}
}
