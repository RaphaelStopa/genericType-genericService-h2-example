package com.generic.example.services;

import com.generic.example.entities.Employee;
import com.generic.example.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.generic.example.dto.EmployeeDTO;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long>{

	@Autowired
	private EmployeeRepository repository;


	@Override
	public JpaRepository getRepository() {
		return repository;
	}
}
