package com.yucelen.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yucelen.model.User;

@RestController
@RequestMapping(path="/api") //localhost:8080/api
public class MyController {

	//RequestBody anotasyonu kullanıcıdan obje almak için kullanılır
	/*postman Body raw JSON
	{
	    "name" : "yücelen",
	    "surName": "üstün",
	    "userName" : "yuce91",
	    "password" : "1234"
	}
	*/
		
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		System.out.println("user saved...");
		user.setPassword("");
		return user;
	}
	
	
	@PostMapping("/users-all")
	public List<User> saveAllUsers(@RequestBody List<User> users) {
		System.out.println("all users saved...");
		users.forEach(user ->user.setPassword(""));
		return users;
	}
	/*
	[
	    {
	        "name": "yücelen",
	        "surName": "üstün",
	        "userName": "yuce91",
	        "password": "1234"
	    },
	    {
	        "name": "berk",
	        "surName": "üstün",
	        "userName": "berk97",
	        "password": "1234"
	    }
    ]
	*/
}
