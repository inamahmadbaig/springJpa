package com.nit.service;

import java.util.List;

import com.nit.entity.Employee;

import jakarta.validation.Valid;

public interface IEmployeeService {

	public List<Employee> addEmployeeData(@Valid List<Employee> employees);
	public List<Employee> viewAllEmp();
	public Employee updateEmp(Employee employee);
	
}
