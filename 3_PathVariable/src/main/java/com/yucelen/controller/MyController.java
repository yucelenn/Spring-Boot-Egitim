package com.yucelen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class MyController {

	
	@GetMapping(path="/message/{m}")
	public String getMyMessage(@PathVariable("m") String message) {  
		return "Your message is: " + message;
	}
	
	// ikisi de çalışır, değişken ismi aynı olursa PathVariable'da belirtmen gerekmez.
	//localhost:8080/api/message/buraya istediğin mesajı gir
	
	@GetMapping(path="/message2/{message}")
	public String getMyMessage2(@PathVariable String message) {  
		return "Your message is: " + message;
	}

}
