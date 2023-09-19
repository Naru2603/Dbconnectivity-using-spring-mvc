package com.infosys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.infosys.entity.Employee;
import com.infosys.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@RequestMapping("/saveEmployee")
	public void saveEmployee(@RequestParam("name") String name, @RequestParam("address") String address, @RequestParam("salary") String salary ) {
		
		Employee emp = new Employee();
		emp.setName(name);
		emp.setAddress(address);
		emp.setSalary(Integer.parseInt(salary));
		
		service.saveEmployee(emp);
	}
}
