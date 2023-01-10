package com.sb;

import java.util.List;
import java.util.Optional;

import javax.transaction.NotSupportedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpRemo empRepo;

    @Override
    public Employee addEmployees(Employee emp) {
        return this.empRepo.save(emp);
    }

    @Override
    public List<Employee> getEmployees() {
        return this.empRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployees(int id) {
        return this.empRepo.findById(id);
    }

    @Override
    public Employee updateEmployees(Employee emp) {
        return this.empRepo.save(emp);
    }

    @Override
    public void deleteEmployees(int id) {
        this.empRepo.deleteById(id);
    }

}
