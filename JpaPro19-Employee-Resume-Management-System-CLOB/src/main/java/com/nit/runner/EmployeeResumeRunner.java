package com.nit.runner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.EmployeeResume;
import com.nit.service.IEmployeeResumeService;
@Component
public class EmployeeResumeRunner implements CommandLineRunner {

	private IEmployeeResumeService employeeResumeService;
	
	public EmployeeResumeRunner(IEmployeeResumeService employeeResumeService) {
		super();
		this.employeeResumeService = employeeResumeService;
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			List<EmployeeResume> list = List.of(
					new EmployeeResume("Inam", "inter-level", Files.readAllBytes(Path.of("C:\\bol\\aaa.pdf"))),
					new EmployeeResume("Ahmad", "inter-level", Files.readAllBytes(Path.of("C:\\bol\\aaa.pdf"))),
					new EmployeeResume("Baig", "Senier-level", Files.readAllBytes(Path.of("C:\\bol\\aaa.pdf")))
					);
			employeeResumeService.saveEmp(list);
			System.out.println("sava all");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("2. View Employee Resume by Id");
			System.out.println(employeeResumeService.viewEmpById(3l));
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("3. View All Employee Resumes");
			employeeResumeService.viewAllEmp().forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		/*
		 * try { System.out.println("4. Delete Employee Resume");
		 * employeeResumeService.deletEmpById(3l); System.out.println("delete "); }
		 * catch (Exception e) { e.printStackTrace(); // TODO: handle exception }
		 */
	}

}
