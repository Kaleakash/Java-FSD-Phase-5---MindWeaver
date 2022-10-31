package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	// http://localhost:9090
	
	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to spring boot with aws";
	}
	
	// http://localhost:9090/say/Akash 
	
	@GetMapping(value = "say/{name}")
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome to spring boot with aws user "+name;
	}
}
