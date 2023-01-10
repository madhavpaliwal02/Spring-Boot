package com.sb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.ResourceAccessException;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmpCtrl {

    @Autowired
    private EmpService empService;

    @GetMapping("/home")
    public String home() {
        return "Hello Palak";
    }

    // Get all emp
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.empService.getEmployees();
    }

    // Get a emp
    @GetMapping("/employees/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
        Employee employee = this.empService.getEmployees(id)
                .orElseThrow(() -> new ResourceAccessException("Employee doesn't exixt with id: " + id));
        return ResponseEntity.ok(employee);
    }

    // Add a emp
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp) {
        return this.empService.addEmployees(emp);
    }

    // Update a emp
    @PutMapping("/employees/{id}")
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
        return this.empService.getEmployees(id)
                .map(employee -> {
                    employee.setName(emp.getName());
                    employee.setDesignation(emp.getDesignation());
                    employee.setCity(emp.getCity());
                    employee.setSalary(emp.getSalary());
                    return this.empService.addEmployees(employee);
                })
                .orElseThrow(() -> new ResourceAccessException("Employee doesn't exixt with id: " + id));
    }

    // Delete a emp
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id) {
        this.empService.deleteEmployees(id);
    }

}
