package com.sb;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EmpServiceImpl implements EmpService {

    private final EmpRepo empRepo;

    @Override
    public Employee addEmployees(Employee emp) {
        return this.empRepo.save(emp);
    }

    @Override
    public List<Employee> getEmployees() {
        return this.empRepo.findAll();
    }

    @Override
    public Employee getEmployees(int id) {
        return this.empRepo.findById(id).get();
    }

    @Override
    public Employee updateEmployees(int id, Employee emp) {
        Employee res = getEmployees(id);

        if (res != null) {
            emp.setId(res.getId());
            this.empRepo.save(emp);
        }

        return this.empRepo.save(emp);
    }

    @Override
    public void deleteEmployees(int id) {
        this.empRepo.deleteById(id);
    }

}
