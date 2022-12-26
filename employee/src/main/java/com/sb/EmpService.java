package com.sb;

import java.util.List;
import java.util.Optional;

public interface EmpService {

    public List<Employee> getEmployees();
    public Optional<Employee> getEmployees(int id);
    public Employee addEmployees(Employee emp);
    public Employee updateEmployees(Employee emp);
    public void deleteEmployees(int id);
}
