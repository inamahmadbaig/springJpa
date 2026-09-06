package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;

import jakarta.validation.Valid;
@Service
@Validated
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public List<Employee> addEmployeeData(@Valid List<Employee> employees) {
		// TODO Auto-generated method stub
		return employeeRepository.saveAll(employees);
	}

	@Override
	public List<Employee> viewAllEmp() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmp(Employee employee) {
		Employee emp = employeeRepository.findById(employee.getEmployeeId()).orElseThrow(() -> new RuntimeException("not find id "+employee.getEmployeeId()));
//		emp.setDepartment(employee.getDepartment());
		emp.setSalary(employee.getSalary());
		return employeeRepository.save(emp);
	}

}
