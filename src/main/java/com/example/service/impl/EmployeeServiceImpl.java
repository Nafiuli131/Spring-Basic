package com.example.service.impl;

import com.example.exception.ResourceNotFoundException;
import com.example.model.Employee;
import com.example.repository.EmployeeRepository;
import com.example.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    EmployeeRepository employeeRepository ;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public Employee saveEmployee(Employee employee) {
       return employeeRepository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
         return employeeRepository.findById(id).orElseThrow(()->
             new ResourceNotFoundException("Employee","id",id)

         );
    }

    @Override
    public Employee updateEmployee( Long id,Employee employee) {
        Employee existenceEmployee = employeeRepository.findById(id).orElseThrow(()->
                new ResourceNotFoundException("Employee","id",id)

        );
        existenceEmployee.setFName(employee.getFName());
        existenceEmployee.setLName(employee.getLName());
        existenceEmployee.setEmail(employee.getEmail());
        employeeRepository.save(existenceEmployee);
        return existenceEmployee;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }


}
