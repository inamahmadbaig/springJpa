package com.nit.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.Employee;
import com.nit.service.IEmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeService employeeService;
	//single insert
	public void insertData(Employee employee) {
		employeeService.insertSave(employee);
	}
	//multiple insert
	public void insertSaveAll(List<Employee> employees) {
		employeeService.insertSaveAll(employees);
	}
	// View Employee By ID
	public Optional<Employee> viewById(Integer id){
		return employeeService.viewEmployeeById(id);
	}
	// View All Employees
	public Iterable<Employee> viewAll(){
		return employeeService.viewAllEmployees();
	}
	// Check Employee Exists
	public boolean checkExistsEmployee(int id) {
		return employeeService.checkEmployeeExists(id);
	}
	
	// Count Total Employees
	public long countEmp() {
		return employeeService.countTotalEmployees();
	}
	// Update Employee
	public Employee updateById(int id , Employee employee) {
		return employeeService.updateByID(id, employee);
	}
	// Delete Employee By ID
	public void deleteById(int id) {
		employeeService.deleteEmployeeById(id);
	}
	// Delete Employee Record
	public void deleteEmpRecord(Employee employee) {
		employeeService.deleteEmployeeRecord(employee);
	}
	// Delete Multiple Employee Records
	public void deleteMultipleEmpRecorde(List<Employee> employees) {
		employeeService.deleteMultipleEmployeeRecord(employees);
	}
	// Delete All Employees
	public void deleteAllmp() {
		employeeService.deleteAllEmployees();
	}
}
