package com.nit.runner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Student;
import com.nit.service.IStudentService;
@Component
public class StudentRunnerTest implements CommandLineRunner {

	
	private IStudentService service;
	
	public StudentRunnerTest(IStudentService service) {
		super();
		this.service = service;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			System.out.println("add student details");
			List<Student> listStudent = List.of(
					new Student("Inam", "MCA", Files.readAllBytes(Path.of("C:\\bol\\aaa.pdf"))),
					new Student("Ahmad", "java", Files.readAllBytes(Path.of("C:\\bol\\women.jpg")))
					);
			service.addStudentDetails(listStudent);
			System.out.println("add details successfull");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		try {
			System.out.println("view Student data");
			service.viewStudent().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
