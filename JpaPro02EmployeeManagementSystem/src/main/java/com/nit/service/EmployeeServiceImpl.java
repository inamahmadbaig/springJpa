package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements IEmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public void insertSave(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
	}

	@Override
	public void insertSaveAll(List<Employee> employees) {
		// TODO Auto-generated method stub
		employeeRepository.saveAll(employees);
	}

	@Override
	public Optional<Employee> viewEmployeeById(Integer id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id);
	}

	@Override
	public Iterable<Employee> viewAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public boolean checkEmployeeExists(int id) {
		// TODO Auto-generated method stub
		
		return employeeRepository.existsById(id);
	}

	@Override
	public long countTotalEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.count();
	}

	@Override
	public Employee updateByID(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent()) {
			Employee employee2 = emp.get();
			
			employee2.setEmployeeId(employee.getEmployeeId());
			employee2.setEmployeeName(employee.getEmployeeName());
			employee2.setDepartment(employee.getDepartment());
			employee2.setSalary(employee.getSalary());
		
			return employeeRepository.save(employee2);
		}
		return null;
	}

	@Override
	public void deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(id);
	}

	@Override
	public void deleteEmployeeRecord(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
	}

	@Override
	public void deleteMultipleEmployeeRecord(List<Employee> employees) {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll(employees);
	}

	@Override
	public void deleteAllEmployees() {
		// TODO Auto-generated method stub
		employeeRepository.deleteAll();
	}

}
