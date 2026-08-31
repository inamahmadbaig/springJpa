package com.nit.runner;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.entity.Patient;
import com.nit.service.IDoctorService;
@Component
public class HospitalPatientManagementRunner implements CommandLineRunner {

	private IDoctorService doctorService;
	
	public HospitalPatientManagementRunner(IDoctorService doctorService) {
		super();
		this.doctorService = doctorService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		try {
			System.out.println("Enter details ");
			List<Patient> plist1 = List.of(
					new Patient("Raj", "Heart Problem", 35),
					new Patient("Priya", "High Blood Pressure", 40)	
					);
			List<Patient> plist2 = List.of(
					new Patient("Rohan", "Kidney", 46),
					new Patient("Rohit", "vp", 30)
					);
			List<Patient> plist3 = List.of(
					new Patient("Naved", "Diabetes", 55),
					new Patient("Naved", "Addison's", 55)
					);
			
			System.out.println("Add doctor");
			List<Doctor> dList =List.of(
					new Doctor(" Dr. Sharma", "Cardiologist", plist1),
					new Doctor(" Dr. Ali", "General Surgery", plist2),
					new Doctor(" Dr. Ahmad", "Endocrinology", plist3)
					);
			doctorService.addDetaile(dList);
			System.out.println("Sava all data ");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		*/
		
		try {
			System.out.println("view all doctor or patient");
			doctorService.viewDoctorDetails().forEach(doctor ->{
				System.out.println("Doctor Id      :  "+doctor.getDoctorId());
				System.out.println("Doctor Name    :  "+doctor.getDoctorName());
				System.out.println("Specialization : "+doctor.getSpecialization());
				
				System.out.println("====================================");
				System.out.println("--Patient Details--");
				
				doctor.getPatients().forEach(patient->{
					System.out.println("Patient Id   	: "+patient.getPatientId());
					System.out.println("Patient Name 	: "+patient.getPatientName());
					System.out.println("Patient Disease : "+patient.getDisease());
					System.out.println("Patient Age 	: "+patient.getAge());
					System.out.println("\n");
				});
				/*
				  doctorService.viewPatientDetails().forEach(patient->{
				  System.out.println("Patient Id   	: "+patient.getPatientId());
				  System.out.println("Patient Name 	: "+patient.getPatientName());
				  System.out.println("Patient Disease : "+patient.getDisease());
				  System.out.println("Patient Age 	: "+patient.getAge()); //
				  System.out.println("Doctor          : "+patient.getDoctor()); });
				 */
				System.out.println("==============================");
			});
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
