package com.example.rest_demo.Controller;

import com.example.rest_demo.model.Employee;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmpApiService {
    Employee employee;

    @GetMapping("{emp_id}")
    public Employee getEmployeDeatils(String emp_id){
        return employee;
    }

    @PostMapping
    public String CreateEmployee(@RequestBody Employee employee){
        this.employee = employee;
        return "Employee created successfully";
    }

    @PutMapping
    public String UpdateEmployee(@RequestBody Employee employee){
        this.employee = employee;
        return "Employee updated successfully";
    }

    @DeleteMapping("{emp_id}")
    public String deleteEmployee(String emp_id){
        this.employee = null;
        return "Employee deleted successfully";
    }
}
