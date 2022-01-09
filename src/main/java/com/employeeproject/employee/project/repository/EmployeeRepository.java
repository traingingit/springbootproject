package com.employeeproject.employee.project.repository;

import com.employeeproject.employee.project.model.Employee;
import com.employeeproject.employee.project.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
