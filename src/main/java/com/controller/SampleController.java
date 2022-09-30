package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

	@GetMapping(value = "/")
	public String greeting() {
		return "Welcome to spring boot with aws created by Moeketsi";
	}
	
	
	@GetMapping(value = "say/{name}")
	
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome user" + name + " to Spring boot with AWS";
	}
}
