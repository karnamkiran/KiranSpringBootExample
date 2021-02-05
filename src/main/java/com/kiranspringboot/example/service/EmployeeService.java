package com.kiranspringboot.example.service;

import java.util.List;

import com.kiranspringboot.example.entity.Employee;

public interface EmployeeService {

	public List<Employee> findAll();
	
	public Employee findById(int theId);
	
	public void save(Employee theEmployee);
	
	public void deleteById(int theId);
	
}
