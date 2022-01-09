package com.employeeproject.employee.project.service;

import com.employeeproject.employee.project.model.Employee;
import com.employeeproject.employee.project.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getEmployee()
    {
        return employeeRepository.findAll();
    }

    public String addEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
        {
            return "employee Id already exist";
        }
        else{
            employeeRepository.save(employee);
            return "added Successfully";
        }


    }

    public String updateEmployee(Employee employee)
    {
        if(employeeRepository.existsById(employee.getId()))
        {
            employeeRepository.save(employee);
            return "updated successfully";
        }
        else
        {
            return "record not found";
        }

    }

    public String deleteEmployee(int id) {
        if(employeeRepository.existsById(id))
        {
            employeeRepository.deleteById(id);
            return "employee deleted";
        }
        else
        {
            return "employee not found";
        }
    }
}
