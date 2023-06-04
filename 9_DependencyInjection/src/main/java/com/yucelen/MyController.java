package com.yucelen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MyController {
	
	//Autowired anotasyonu yardımıyla IoC den çekiyoruz.
	
	@Autowired
	private FirstClass firstClass;
	
	@Autowired
	private SecondClass secondClass;

	@GetMapping("/first-class")
	private String getNameOfFirstClass() {
		return firstClass.getName(); 
	}
	
	@GetMapping("/second-class")
	private String getNameOfSecondClass() {
		return secondClass.getName(); 
	}
}
