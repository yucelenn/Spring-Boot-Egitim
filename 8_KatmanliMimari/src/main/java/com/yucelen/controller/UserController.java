package com.yucelen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yucelen.dto.User;
import com.yucelen.service.UserService;

@RestController
@RequestMapping(path="/api")
public class UserController {
	
	@Autowired
	private UserService userService;		

	@GetMapping("/users/{userId}")
	public User getUserById(@PathVariable("userId") Long userId) {
		return userService.getUserById(userId);
	}
}
