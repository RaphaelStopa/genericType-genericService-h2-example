package com.generic.demolazy.services;

import com.generic.demolazy.entities.Employee;
import com.generic.demolazy.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.generic.demolazy.dto.EmployeeDTO;

@Service
public class EmployeeService implements GenericService<Employee, EmployeeDTO, Long>{

	@Autowired
	private EmployeeRepository repository;


	@Override
	public JpaRepository getRepository() {
		return repository;
	}
}
