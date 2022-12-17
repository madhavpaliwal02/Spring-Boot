package com.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entities.Student;
import com.crud.repository.StudentDao;

@Service
public class StuServiceImpl implements StuService {

	@Autowired
	private StudentDao studentDao;

	// Get all Students
	@Override
	public List<Student> getStudents() {
		return studentDao.findAll();
	}

	// Get a Student
	@Override
	public Student getStudent(long id) {
		return studentDao.getOne(id);
//		Student s = (Student) studentDao.getReferenceById(id);
//		System.out.println(s);
//		return s;
	}

	// Add a Student
	@Override
	public Student addStudent(Student s) {
		studentDao.save(s);
		return s;
	}

	// Delete a Student
	@Override
	public void deleteStudent(long id) {
		studentDao.delete(getStudent(id));
	}

	// Update a Student
	@Override
	public Student updateStudent(Student s) {
		studentDao.save(s);
		return s;
	}

}
