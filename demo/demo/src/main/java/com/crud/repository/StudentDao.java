package com.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.entities.Student;

public interface StudentDao extends JpaRepository<Student, Long> {

}
