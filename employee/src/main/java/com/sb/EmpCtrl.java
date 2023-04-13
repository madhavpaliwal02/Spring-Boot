package com.sb;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
// @CrossOrigin("http://localhost:3000")
public class EmpCtrl {

    private final EmpService empService;

    @GetMapping("/home")
    public String home() {
        return "Hello Palak";
    }

    // Get all emp
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Employee> getEmployees() {
        return this.empService.getEmployees();
    }

    // Get a emp
    @GetMapping("{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Employee> getEmployee(@PathVariable int id) {
        Employee employee = this.empService.getEmployees(id);
        return ResponseEntity.ok(employee);
    }

    // Add a emp
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Employee addEmployee(@RequestBody Employee emp) {
        return this.empService.addEmployees(emp);
    }

    // Update a emp
    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public Employee updateEmployee(@PathVariable int id, @RequestBody Employee emp) {
        return this.updateEmployee(id, emp);
    }

    // Delete a emp
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void deleteEmployee(@PathVariable int id) {
        this.empService.deleteEmployees(id);
    }

}
