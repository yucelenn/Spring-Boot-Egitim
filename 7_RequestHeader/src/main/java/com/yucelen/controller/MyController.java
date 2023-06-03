package com.yucelen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class MyController {

	// postman Headers
	@GetMapping("/header")
	public String getHeader(@RequestHeader("My-Header") String myHeader) {
		return "your header : " + myHeader;
	}

}