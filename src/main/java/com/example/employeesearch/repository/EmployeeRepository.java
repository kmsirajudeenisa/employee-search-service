package com.example.employeesearch.repository;

import com.example.employeesearch.model.Employee;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepository extends ElasticsearchRepository<Employee, String> {

    List<Employee> findByDepartment(String department);

    List<Employee> findByDesignation(String designation);

    List<Employee> findByFirstNameContainingOrLastNameContaining(String firstName, String lastName);
}