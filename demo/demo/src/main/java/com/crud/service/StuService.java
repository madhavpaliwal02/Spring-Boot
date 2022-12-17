package com.crud.service;

import java.util.List;
import java.util.Optional;

import com.crud.entities.Student;

public interface StuService {

	// Get all Students
	public List<Student> getStudents();

	// Get a Student
	public Optional<Student> getStudent(long id);

	// Add a Student
	public Student addStudent(Student s);

	// Update a Student
	public Student updateStudent(Student s);

	// Delete a Student
	public void deleteStudent(long id);

}
