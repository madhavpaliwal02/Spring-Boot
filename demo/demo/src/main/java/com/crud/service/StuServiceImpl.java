package com.crud.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.crud.entities.Student;

@Service
public class StuServiceImpl implements StuService {
	// Get all Students
	// Get a Student
	// Add a Student
	// Update a Student
	// Delete a Student

	List<Student> list;

	public StuServiceImpl() {
		list = new ArrayList<>();
		list.add(new Student(27, "Madhav Paliwal", "mp@gmail.com", "IT-2K19-27"));
		list.add(new Student(39, "Palak Porwal", "pp@gmail.com", "IT-2K19-39"));
	}

	///////////////////////////////////////////////////////////////////////////////////////////
	// Get all Students
	@Override
	public List<Student> getStudents() {
		// TODO Auto-generated method stub
		return list;
	}

	// Get a Student
	@Override
	public Student getStudent(long id) {
		// TODO Auto-generated method stub
		Student student = null;
		List<Student> stu = getStudents();
		for (Student s : stu) {
			if (s.getId() == id)
				student = s;
		}
		return student;
	}

	// Add a Student
	@Override
	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		this.list.add(s);
		return s;
	}

	// Delete a Student
	@Override
//	public List<Student> deleteStudent(long id) {
//		Student s = getStudent(id);
//		list.remove(s);
//		return list;
//	}
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub
		list = this.list.stream().filter(e-> e.getId() != id).collect(Collectors.toList());
	}

	// Update a Student
	@Override
	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		list.forEach(e->{
			if(e.getId() == s.getId()) {
				e.setName(s.getName());
				e.setEmail(s.getEmail());
				e.setRollno(s.getRollno());
			}
		});
		return s;
	}

}
