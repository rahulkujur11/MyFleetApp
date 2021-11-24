package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {
	
	
	
	@GetMapping("/models")
	public String getCountries()	{
		return "Model";
	}
}
