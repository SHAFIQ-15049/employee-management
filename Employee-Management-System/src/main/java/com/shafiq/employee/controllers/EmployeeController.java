package com.shafiq.employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shafiq.employee.entities.Employee;
import com.shafiq.employee.repositories.EmployeeRepository;

@CrossOrigin(origins="*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

	@Autowired
	private EmployeeRepository empRepository;
	
	
	@GetMapping("/employees")
	public List<Employee> findAllEmployees()
	{
		return empRepository.findAll();
	}
}
