package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.User;
import com.crud.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class MyCtrl {

	@Autowired
	private UserRepository userRepo;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome Back Beauty !!!";
	}
	
	
	// Get all users
	@GetMapping("/users")
	public List<User> getUsers(){
		return this.userRepo.findAll();
	}
}
