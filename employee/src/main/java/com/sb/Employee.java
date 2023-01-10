package com.sb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String designation;
    private long salary;

    public Employee() {
    }

    public Employee(int id, String name, String city, String designation, long salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.designation = designation;
        this.salary = salary;
    }

    public Employee(String name, String city, String designation, long salary) {
        this.name = name;
        this.city = city;
        this.designation = designation;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", designation=" + designation + ", salary="
                + salary + "]";
    }

}
