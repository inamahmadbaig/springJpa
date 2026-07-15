package com.nit.service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.nit.entity.Employee;

public interface IEmployeesService {

	
	public List<Employee> getEmployeesByPage(int pageNumber, int pageSize);
	public List<Employee> getEmployeesSortedBySalary();
	public List<Employee> getEmployeesSortedByName();
	
}
