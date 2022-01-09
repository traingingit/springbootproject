package com.employeeproject.employee.project.controller;

import com.employeeproject.employee.project.model.Employee;
import com.employeeproject.employee.project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getEmployee()
    {
        return employeeService.getEmployee();
    }

    @PostMapping("/addemp")
    public String addEmployee(@RequestBody Employee employee)
    {
        return employeeService.addEmployee(employee);
    }

    @PutMapping("/updateemp")
    public String updateEmployee(@RequestBody Employee employee)
    {
        return employeeService.updateEmployee(employee);
    }

    @DeleteMapping("/deleteemp/{empid}")
    public String deleteEmployee(@PathVariable String empid)
    {
        return employeeService.deleteEmployee(Integer.parseInt(empid));
    }
}
