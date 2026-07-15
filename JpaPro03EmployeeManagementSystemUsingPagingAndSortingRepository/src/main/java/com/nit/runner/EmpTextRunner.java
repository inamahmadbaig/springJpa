package com.nit.runner;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.EmployeeInsert;
import com.nit.service.IEmployeesService;

@Component
public class EmpTextRunner implements CommandLineRunner {

	@Autowired
	private IEmployeesService employeesService;
	
	@Autowired
	private EmployeeInsert employeeInsert;

	@Override
	public void run(String... args) throws Exception {

		List<Employee> employeeslist = Arrays.asList(
				new Employee(1, "inam", "it", 50000.0),
				new Employee(2, "Ahmad", "it", 40000.0),
				new Employee(3, "Priya", "Hr", 40000.0),
				new Employee(4, "Neha", "Testing", 45000.0),
				new Employee(5, "Rahul", "it", 42000.0),
				new Employee(6, "Kavya", "sales", 58000.0),
				new Employee(7, "Amit", "Testing", 46000.0),
				new Employee(8, "Arjun", "it", 49000.0),
				new Employee(9, "Rohan", "it", 48000.0)
		);
		
		// 1. Insert Data
		String msg = employeeInsert.insertData(employeeslist);
		System.out.println("Status: " + msg);
		
		// 2. Test Pagination
		System.out.println("\n--- Employees (Page 0, Size 3) ---");
		try { 
			// Fixed: Direct assignment to List<Employee>
			List<Employee> employees = employeesService.getEmployeesByPage(0, 3);
			employees.forEach(System.out::println); 
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		// 3. Test Sorting by Salary
		System.out.println("\n--- Employees Sorted by Salary ---");
		try { 
			List<Employee> sortedSalary = employeesService.getEmployeesSortedBySalary();
			sortedSalary.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
		
		// 4. Test Sorting by Name
		System.out.println("\n--- Employees Sorted by Name ---");
		try { 
			List<Employee> sortedName = employeesService.getEmployeesSortedByName();
			sortedName.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace(); 
		}
	}
}