package com.generic.demolazy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generic.demolazy.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
