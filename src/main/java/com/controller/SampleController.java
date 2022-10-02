package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class SampleController {

	@GetMapping(value = "/")
	public ModelAndView greeting() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}
	
	
	@GetMapping(value = "say/{name}")
	
	public String sayHello(@PathVariable("name") String name) {
		return "Welcome user" + name + " to Spring boot with AWS";
	}
}
