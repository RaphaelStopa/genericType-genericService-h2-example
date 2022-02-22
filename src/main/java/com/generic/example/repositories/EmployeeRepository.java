package com.generic.example.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generic.example.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
