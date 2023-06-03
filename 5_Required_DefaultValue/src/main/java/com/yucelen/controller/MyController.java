package com.yucelen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class MyController {

	//isRequired alanın boş geçilip geçilemeyeceğini belirten anotasyon
	// required = false ise kullanıcı veri girmeden de kullanabilir endpointi.
	// birden fazla path olacaksa süslü parantez ve tırnak ile belirt:
	@GetMapping(path = {"/message1" , "/message1/{message}"} )
	public String getMyMessageWithVariable(@PathVariable(name="message" , required = false) String message) { 
		return "Your message is: " + message;
	}
	
	//localhost:8080/api/message1/ Burayı doldur ya da boş bırak.
	
	
	
	@GetMapping(path="/message2")
	public String getMyMessageWithParam(@RequestParam(name="m",required=false, defaultValue="default message") String message) { 
		return "Your message is: " + message;
	}
	
	//localhost:8080/api/message2?m= Burayı doldur ya da boş bırak. Boş bırakırsan default değeri verir.
	


}
