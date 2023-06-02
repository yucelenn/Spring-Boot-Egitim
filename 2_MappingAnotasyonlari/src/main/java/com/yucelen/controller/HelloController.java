package com.yucelen.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class HelloController {
	
	// @GetMapping: veri görüntüleme
	// @PostMapping: veri kaydetme
	// @PutMapping: veri güncelleme
	// @PatchMapping: verinin bir bölümünü güncelleme(parola güncelleme gibi)
	// @DeleteMapping: veri silme
	
	//@RequestMapping(path="/api" , method = RequestMethod.GET)
	@GetMapping(path="/hello")
	public String sayHello() {  //localhost:8080/api/hello
		return "Hello World";
	}
	
	@PostMapping(path="/save")
	public String save() {    //localhost:8080/api/save
		return "Data saved";
	}
	
	@DeleteMapping("/delete")
	public String delete() {   //localhost:8080/api/delete
		return "Data deleted";
	}

}
