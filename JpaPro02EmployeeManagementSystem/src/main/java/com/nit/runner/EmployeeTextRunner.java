package com.nit.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.EmployeeController;
import com.nit.entity.Employee;
@Component
public class EmployeeTextRunner implements CommandLineRunner {

	@Autowired
	private EmployeeController controller;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//single emp insert
//		Employee emp = new Employee(1,"inam","it",55000);
//		controller.insertData(emp);
//		
	//Multiple data insert
		/*Employee emp = new Employee(2,"inam","it",55000);
		Employee emp2 = new Employee(3,"inam","it",55000);
		
		controller.insertSaveAll(Arrays.asList(emp,emp2));
		*/
		//view by id 
		//System.out.println("Employee -> "+controller.viewById(1));

		//View All Employees
		//System.out.println("emplyee -> "+controller.viewAll());
		
		//Check Employee Exists
		//System.out.println("emp -> "+controller.checkExistsEmployee(2));
		
		//6. Count Total Employees
		//System.out.println("emp -> "+controller.countEmp());
		/*
		//7. Update Employee Details
		Employee emp = new Employee();
		emp.setEmployeeId(3);
		emp.setEmployeeName("Baig ji");
		emp.setDepartment("sales");
		emp.setSalary(75000);
		
		System.out.println("emp updated -> "+controller.updateById(3, emp));
		*/
		/*
		//8. Delete Employee By Id
		controller.deleteById(0);
		System.out.println("emp delete by id");
		*/
		
		//9. Delete Employee Record
		//controller.deleteEmpRecord(emp);
		//System.out.println("delete recode ");
		
		//Delete Multiple Employees

//		controller.deleteMultipleEmpRecorde(Arrays.asList(emp,emp2));
//		System.err.println("delete");
		
		//11. Delete All Employees
		controller.deleteAllmp();
		System.err.println("delete all data");
	}

}
