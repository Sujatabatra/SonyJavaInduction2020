package com.sujata.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyResource {

	@GetMapping("/first")
	public String getMessage(){
		return "Hello welcome to the world of Spring Rest API";
	}
}
