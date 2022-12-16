package com.crud.entities;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//@Table(name = "students")
public class Student {

//	@Id
//	@Column(name = "id")	
	private long id;
	private String name;
	private String email;
	private String rollno;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String email, String rollno) {
		super();
		this.name = name;
		this.email = email;
		this.rollno = rollno;
	}

	public Student(long id, String name, String email, String rollno) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.rollno = rollno;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRollno() {
		return rollno;
	}

	public void setRollno(String rollno) {
		this.rollno = rollno;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", rollno=" + rollno + "]";
	}

}
