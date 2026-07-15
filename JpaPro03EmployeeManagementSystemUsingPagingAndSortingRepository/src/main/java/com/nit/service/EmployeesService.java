package com.nit.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.nit.entity.Employee;
import com.nit.repository.EmployeeRepository;
import com.nit.repository.IEmployeeInsert;

@Service
public class EmployeesService implements IEmployeesService, EmployeeInsert {

	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private IEmployeeInsert employeeInsert;
	@Override
	public List<Employee> getEmployeesByPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		// Fixed: Added .getContent() to match the List<Employee> return type
		return employeeRepository.findAll(pageable).getContent();
	}

	@Override
	public List<Employee> getEmployeesSortedBySalary() {
		Sort sort = Sort.by(Sort.Direction.ASC, "salary");
		return (List<Employee>) employeeRepository.findAll(sort);
	}

	@Override
	public List<Employee> getEmployeesSortedByName() {
		Sort sort = Sort.by(Sort.Direction.ASC, "employeeName");
		return (List<Employee>) employeeRepository.findAll(sort);
	}

	@Override
	public String insertData(List<Employee> employeeslist) {
		employeeInsert.saveAll(employeeslist);
		
		return "Successfully inserted " + employeeslist.size() + " employees.";
	}
}