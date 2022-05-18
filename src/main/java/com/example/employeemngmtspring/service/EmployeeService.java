package com.example.employeemngmtspring.service;

import com.example.employeemngmtspring.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmmployee(Employee employee);
    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);
}
