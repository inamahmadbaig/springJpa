package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.repository.DoctorRepository;
@Component
public class DoctorsRunner implements CommandLineRunner {

	@Autowired
	private DoctorRepository doctorRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * try { List<Doctor> list = List.of( new Doctor("Dr. Raj Sharma", "Cardiology",
		 * "Apollo Hospital", "Chennai", 800.0, 10, "raj.sharma@hospital.com"), new
		 * Doctor("Dr. Amit Kumar","Neurology","Fortis Care Hospital",
		 * "Bengaluru",1200.0,15,"amit.kumar@hospital.com"),
		 * 
		 * new Doctor("Dr. Rajesh Verma","Orthopedics","Max Healthcare",
		 * "Delhi",900.0,8,"rajesh.verma@gmail.com"),
		 * 
		 * new Doctor("Dr. Anjali Singh","Cardiology","Care Hospital",
		 * "Hyderabad",1000.0,12,"anjali.singh@hospital.com"),
		 * 
		 * new Doctor("Dr. Arjun Kumar","Neurology","Global Care Medical Center",
		 * "Chennai",1500.0,18,"arjun.kumar@hospital.com"),
		 * 
		 * new Doctor("Dr. Raju Patel","Orthopedic Surgery","City Hospital",
		 * "Bengaluru",700.0,6,"raju.patel@yahoo.com"),
		 * 
		 * new Doctor("Dr. Raj Malhotra","Dermatology","Sunrise Care Hospital",
		 * "Mumbai",600.0,5,"raj.malhotra@hospital.com"),
		 * 
		 * new Doctor("Dr. Akash Kumar","Orthodontics","Apollo Hospital",
		 * "Chennai",850.0,7,"akash.kumar@hospital.com"),
		 * 
		 * new Doctor("Dr. Rajendra Kumar","Neurology","Care Plus Hospital",
		 * "Bengaluru",1300.0,14,"rajendra.kumar@hospital.com"),
		 * 
		 * new Doctor("Dr. Ankit Sharma","Orthopedics","Metro Hospital",
		 * "Pune",750.0,9,"ankit.sharma@gmail.com") ); doctorRepository.saveAll(list);
		 * System.err.println("SAve alll ");
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		/*
		try {
			System.out.println("1. Find doctors whose names match LIKE '%Raj%'.");
			doctorRepository.findByDoctorNameLike("%Raj%").forEach(System.out::println);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		/*
		 * try { System.out.
		 * println("2. Find doctors whose specialization is in [Cardiology, Neurology]"
		 * );
		 * doctorRepository.findBySpecializationIn(List.of("Cardiology","Neurology")).
		 * forEach(System.out::println);
		 * 
		 * } catch (Exception e) { System.out.println(e.getMessage());
		 * e.printStackTrace();
		 * 
		 * }
		 */
		/*
		 * try { System.out.println("3. Find doctors whose names start with 'Dr. A'.");
		 * doctorRepository.findByDoctorNameStartingWith("Dr. A").forEach(System.out::
		 * println); } catch (Exception e) { e.printStackTrace(); // TODO: handle
		 * exception }
		 */
		
		/*
		 * try { System.out.println("4. Find doctors whose names end with 'Kumar'.");
		 * doctorRepository.findByDoctorNameEndingWith("Kumar").forEach(System.out::
		 * println); } catch (Exception e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */
		/*
		 * try { //List.of("Chennai","Bengaluru","Mumbai","Hyderabad") is me multipel
		 * add kar sakte h q ki list ha System.err.
		 * println("5. Find doctors located in Chennai or Bengaluru using IN.");
		 * doctorRepository.findByCityIn(List.of("Chennai","Bengaluru","Mumbai",
		 * "Hyderabad")).forEach(System.out::println);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); }
		 */
		
		/*
		 * try { System.out.println("6. Find hospitals matching LIKE '%Care%'.");
		 * doctorRepository.findByHospitalNameLike("%Care%").forEach(System.out::println
		 * ); } catch (Exception e) { // TODO: handle exception e.printStackTrace(); }
		 */
		
		/*
		 * try {
		 * System.out.println("7. Find doctors with email ending '@hospital.com'.");
		 * doctorRepository.findByEmailEndingWith("@hospital.com").forEach(System.out::
		 * println);
		 * 
		 * } catch (Exception e) { e.printStackTrace(); // TODO: handle exception }
		 * 
		 */		
		
		/*
		 * try {
		 * 
		 * System.out.println("8. Find specializations starting with 'Ortho'.");
		 * doctorRepository.findBySpecializationStartingWith("Ortho").forEach(System.out
		 * ::println); } catch (Exception e) { // TODO: handle exception
		 * e.printStackTrace(); }
		 */
		/*
		try {
		    System.out.println("Before Update Version");

		    Doctor doctor = doctorRepository.findById(103L).get();

		    System.out.println(doctor.getVersion());

		    doctor.setConsultationFee(1500.0);

		    doctorRepository.save(doctor);

		    Doctor updated = doctorRepository.findById(103L).get();

		    System.out.println("After Update Version");

		    System.out.println(updated.getVersion());

		} catch (Exception e) {
		    e.printStackTrace();
		}
		*/

		try {
			System.out.println("10. Verify createdAt remains unchanged while updatedAt changes after update");
			Doctor d = doctorRepository.findById(100l).get();
			d.setExperience(1);
			doctorRepository.save(d);
			System.out.println("save");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	

}
