package com.demo.MyFleetApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleMovementController {
	
	
	
	@GetMapping("/vehiclemovements")
	public String getCountries()	{
		return "VehicleMovement";
	}
}
