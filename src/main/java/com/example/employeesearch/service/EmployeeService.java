package com.example.employeesearch.service;

import com.example.employeesearch.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    Employee create(Employee employee);

    Optional<Employee> findById(String id);

    List<Employee> findAll();

    Employee update(String id, Employee employee);

    void delete(String id);

    List<Employee> searchByName(String name);

    List<Employee> findByDepartment(String department);

    List<Employee> findByDesignation(String designation);
}