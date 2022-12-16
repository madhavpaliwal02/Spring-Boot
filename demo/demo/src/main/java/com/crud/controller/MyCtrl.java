package com.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entities.Student;
import com.crud.service.StuService;

@RestController
public class MyCtrl {
	
	@Autowired
	private StuService stuService;

	@GetMapping("/home")
	public String home() {
		return "Welcome Home Dear Paalak Paneer";
	}
	
	// Get All students
	@GetMapping("/students")
	public List<Student> getStudents() {
		return this.stuService.getStudents();
	}
	
	// Get A student by id
	@GetMapping("/students/{id}")
	public Student getStudent(@PathVariable Long id) {
		return this.stuService.getStudent(id);
	}
	
	// Add a student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		return this.stuService.addStudent(s);
	}
	
	// Delete a student
	@DeleteMapping("/students/{id}")
	public List<Student> deleteStudent(@PathVariable long id) {
		return this.stuService.deleteStudent(id);
	}
	
	// Update a student
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student s) {
		return this.stuService.updateStudent(s);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
