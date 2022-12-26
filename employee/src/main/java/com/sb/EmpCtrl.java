package com.sb;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class EmpCtrl {

    @Autowired
    private EmpService empService;

    @GetMapping("/home")
    public String home() {
        return "Hello Palak";
    }

    // Get all
    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return this.empService.getEmployees();
    }

    // Get a emp
    @GetMapping("/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable int id) {
        return this.empService.getEmployees(id);
    }

    // Add a emp
    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee emp) {
        return this.empService.addEmployees(emp);
    }

    // Update a emp
    @PutMapping("/employees")
    public Employee updateEmployee(@RequestBody Employee emp) {
        return this.empService.updateEmployees(emp);
    }

    // Delete a emp
    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id){
        this.empService.deleteEmployees(id);
    }

}
