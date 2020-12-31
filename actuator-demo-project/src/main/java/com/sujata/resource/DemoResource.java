package com.sujata.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoResource {

	@GetMapping(path="/first")
	public String getResource(){
		return "Hi I am dummy resource to see actuators";
	}
	
}
