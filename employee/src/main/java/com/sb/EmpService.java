package com.sb;

import java.util.List;

public interface EmpService {

    public List<Employee> getEmployees();
    public Employee getEmployees(int id);
    public Employee addEmployees(Employee emp);
    public Employee updateEmployees(int id, Employee emp);
    public void deleteEmployees(int id);
}
