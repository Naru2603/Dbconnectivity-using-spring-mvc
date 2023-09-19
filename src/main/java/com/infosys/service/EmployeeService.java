package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.dao.EmployeeRepository;
import com.infosys.entity.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository repository;

	public void saveEmployee(Employee e) {
		repository.saveEmployeeToDb(e);
	}
}
