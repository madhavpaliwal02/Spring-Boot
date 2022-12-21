package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.User;
import com.crud.services.UserService;

//@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MyCtrl {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() {
		return "Welcome Back Beauty !!!";
	}

	// Get all user by id
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int id) {
		return userService.getUser(id);
	}
}
