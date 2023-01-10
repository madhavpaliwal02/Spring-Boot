package com.crud.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crud.entity.User;
import com.crud.services.UserService;

@RestController
public class MyCtrl {

	@Autowired
	private UserService userService;

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/home")
	public String home() {
		return "Welcome Back Beauty !!!";
	}

	// Get all user by id
	@GetMapping("/users/{userId}")
	public User getUser(@PathVariable("userId") int id) {

		User u = userService.getUser(id);

		// Fetching contacts via microservices
		u.setContact(this.restTemplate.getForObject("http://contact-service:9200/contacts/" + id, List.class));

		return u;
	}
}
