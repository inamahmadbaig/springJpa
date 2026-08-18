package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Course;
import com.nit.entity.University;
import com.nit.service.IUniversityCourseService;
@Component
public class UniversityYRunner implements CommandLineRunner {

	@Autowired
	private IUniversityCourseService courseService;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*try {
			System.out.println("Coures");
			List<Course> couList = List.of(
					new Course("Java Full Stack", "6 month", 30000d),
					new Course("Spring Boot", "6 month", 15000d),
					new Course("HTMl CSS JavaScript ", "6 month", 25000d)
					
					);
			
			System.out.println("Add University Coures ");
			List<University> list = List.of(
					new University("Global University", "Hyderabad", couList)
					);
			courseService.addUniversityDetais(list);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		try {
			System.out.println("Show");
			System.out.println("Show");

			courseService.showAllData().forEach(university -> {

			    System.out.println("University Id   : " + university.getUniversityId());
			    System.out.println("University Name : " + university.getUniversityName());
			    System.out.println("City            : " + university.getCity());

			    System.out.println("Courses:");

			    university.getCourses().forEach(course -> {
			        System.out.println("Course Id   : " + course.getCourseId());
			        System.out.println("Course Name : " + course.getCourseName());
			        System.out.println("Duration    : " + course.getDurationS());
			        System.out.println("Fee         : " + course.getFee());
			        System.out.println("----------------------------");
			    });

			    System.out.println("==============================");
			});

			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}

