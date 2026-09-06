package com.nit.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Employee;
import com.nit.service.IEmployeeService;
@Component
public class EmployeeAttendanceRunner implements CommandLineRunner {

	@Autowired
	private IEmployeeService employeeService;
	private static final Logger log = LoggerFactory.getLogger(EmployeeAttendanceRunner.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			log.info("Emp data insert ");
			List<Employee> employees = List.of(
				    new Employee("Rahul Sharma", "IT", 65000.0),
				    new Employee("Priya Verma", "HR", 50000.0),
				    new Employee("Amit Kumar", "Finance", 72000.0),
				    new Employee("Sneha Patel", "Marketing", 58000.0),
				    new Employee("Rohit Singh", "Sales", 55000.0),
				    new Employee("Neha Gupta", "Operations", 68000.0)
				);
			employeeService.addEmployeeData(employees);
			log.info("save successfull");
			System.out.println("add ");
		} catch (Exception e) {
			log.error("Error come ",e);
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("update salary");
			Employee empUpdate = new Employee();
			empUpdate.setEmployeeId(101l);
			empUpdate.setSalary(75780d);
			employeeService.updateEmp(empUpdate);
			log.info("update Salary Successfull");
			System.out.println("update Salary");
		} catch (Exception e) {
			log.error("Exception came ",e);
			// TODO: handle exception
		}
		
		/*
		try {
			log.info("view all employee data");
			employeeService.viewAllEmp().forEach(System.out::println);
		} catch (Exception e) {
			log.error("Exception come ",e);
			// TODO: handle exception
		}
		*/
	}

}
