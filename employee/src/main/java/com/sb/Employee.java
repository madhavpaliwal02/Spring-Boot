package com.sb;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String city;
    private String designation;
    private long salary;

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", designation=" + designation + ", salary="
                + salary + "]";
    }
}
