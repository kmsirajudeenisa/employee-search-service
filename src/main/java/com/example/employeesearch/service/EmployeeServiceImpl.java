package com.example.employeesearch.service;

import com.example.employeesearch.model.Employee;
import com.example.employeesearch.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private final EmployeeRepository repository;

    @Override
    public Employee create(Employee employee) {
        employee.setId(UUID.randomUUID().toString());
        return repository.save(employee);
    }

    @Override
    public Optional<Employee> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        return StreamSupport.stream(repository.findAll().spliterator(), false)
                .collect(java.util.stream.Collectors.toList());
    }

    @Override
    public Employee update(String id, Employee updated) {
        repository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Employee not found: " + id));
        updated.setId(id);
        return repository.save(updated);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employee> searchByName(String name) {
        return repository.findByFirstNameContainingOrLastNameContaining(name, name);
    }

    @Override
    public List<Employee> findByDepartment(String department) {
        return repository.findByDepartment(department);
    }

    @Override
    public List<Employee> findByDesignation(String designation) {
        return repository.findByDesignation(designation);
    }
}