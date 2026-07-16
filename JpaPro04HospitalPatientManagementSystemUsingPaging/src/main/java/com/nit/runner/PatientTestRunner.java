package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import com.nit.entity.Patient;
import com.nit.service.IPatientService;
@Component
public class PatientTestRunner implements CommandLineRunner {

	@Autowired
	private IPatientService iPatientService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		try {
			while(true) {
				System.out.println("--Hospital Patient Management System Using Paging--");
				System.out.println(" 1. Register Patient ");
				System.out.println(" 2. View by Id");
				System.out.println(" 3. View All Patient");
				System.out.println(" 4. View by Page (Current Page, Total Pages, Total Records)");
				System.out.println(" 5. exit Application");
				System.out.println("\n Choice Option");
				
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				case 1->{
					List<Patient> list = new ArrayList<>();
					System.out.println(" Register Patient ");
					System.out.println("How many Patient Register?\n");
					int nomberOfPatient = Integer.parseInt(sc.nextLine());
					
					for(int i=1;i<=nomberOfPatient;i++) {
						System.out.println("Patient "+i);
						
						System.out.print("Enter patient Name :: ");
						String name = sc.nextLine();
						System.out.print("Enter patient disease :: ");
						String disease = sc.nextLine();
						System.out.print("Enter patient Age :: ");
						int age = Integer.parseInt(sc.nextLine());
						
						Patient insertPatient = new Patient();
						insertPatient.setPatientName(name);
						insertPatient.setDisease(disease);
						insertPatient.setAge(age);
						
						list.add(insertPatient);
					}
					iPatientService.registerPatient(list);
					System.out.println("Patient Register Successfull..");
				}
				case 2->{
					System.out.println("  View by Id");
					System.out.print("\nEnter id ");
					int id = Integer.parseInt(sc.nextLine());
					
					System.out.println("Patient -> "+iPatientService.viewById(id));
							
				}
				case 3->{
					System.out.println(" View All Patient");
					// Assuming you have a viewAllPatient() method in your service
					iPatientService.viewAllPatient().forEach(System.out::println);
				}
				case 4 ->{
					System.out.println("  View Patients Page-wise ");
					// 1. Take inputs from the user
					System.out.print("Enter Page Number (0-based index): ");
					int pageNumber = Integer.parseInt(sc.nextLine());
					
					System.out.print("Enter Page Size (records per page): ");
					int pageSize = Integer.parseInt(sc.nextLine());
					
					// 2. Fetch the page object
					Page<Patient> page = iPatientService.getByPage(pageNumber, pageSize);
					//Display patients page-wise
					System.out.println("\n============== PATIENTS ON PAGE " + pageNumber + " ==============");
					if(page.hasContent()) {
						page.getContent().forEach(System.out::println);
					} else {
						System.out.println("No patients found on this page.");
					}
					// 4. Show the requested metadata
					System.out.println("\n============== PAGINATION DETAILS ==============");
					System.out.println("• Current Page : " + page.getNumber());
					System.out.println("• Total Pages  : " + page.getTotalPages());
					System.out.println("• Total Records: " + page.getTotalElements());
					System.out.println("================================================");
				}
				case 5 -> {
					System.out.println("Exiting Application. Goodbye!");
					System.exit(0);
				}
				default -> {
					System.out.println("Invalid Choice. Please try again.");
				}
				}
			}
					
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
