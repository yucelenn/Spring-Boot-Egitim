package com.yucelen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class HelloController {
	
	//localhost:8080/api/hello
	
	
	//@RequestMapping(path="/api" , method = RequestMethod.GET)
	@GetMapping(path="/hello")
	public String sayHello() {
		return "Hello World";
	}

}
