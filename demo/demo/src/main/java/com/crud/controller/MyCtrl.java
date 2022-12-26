package com.crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entities.Student;
import com.crud.service.StuService;

@CrossOrigin("http://localhost:3000")
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
	public Optional<Student> getStudent(@PathVariable Long id) {
		return this.stuService.getStudent(id);
	}

	// Add a student
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student s) {
		return this.stuService.addStudent(s);
	}

	// Delete a student
	@DeleteMapping("/students/{id}")
	/*
	 * public List<Student> deleteStudent(@PathVariable long id) { return
	 * this.stuService.deleteStudent(id); }
	 */
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable String id) {
		try {
			this.stuService.deleteStudent(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	// Update a student
	@PutMapping("/students")
	public Student updateStudent(@RequestBody Student s) { 
		return this.stuService.updateStudent(s);
	}

}
