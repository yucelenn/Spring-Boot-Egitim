package com.yucelen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class MyController {

	
	@GetMapping(path="/message")
	public String getMyMessage(@RequestParam String message) { 
		return "Your message is: " + message;
	}
	
	//postman params doldurarak (localhost:8080/api/message)      ya da
	//localhost:8080/api/message?message= burayı doldur.
	
	@GetMapping(path="/message2")
	public String getMyMessage2(@RequestParam("m") String message) { 
		return "Your message is: " + message;
	}
	
	//localhost:8080/api/message2?m= burayı doldur.
	
	
	@GetMapping(path="/message3/{message}")
	public String getMyMessage3(@PathVariable String message) {  
		return "Your message is: " + message;
	}

}
