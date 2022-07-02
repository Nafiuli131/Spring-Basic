package com.example.service;

import com.example.model.Employee;

import java.util.List;

public interface EmployeeService {
    public Employee saveEmployee(Employee employee);
    public List<Employee> getAllEmployee();
    public Employee getEmployeeById(Long id);
    public Employee updateEmployee(Long id,Employee employee);
    public void deleteEmployee(Long id);
}
