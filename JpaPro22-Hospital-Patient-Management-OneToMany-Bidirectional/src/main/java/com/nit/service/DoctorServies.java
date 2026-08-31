package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Doctor;
import com.nit.entity.Patient;
import com.nit.repositery.DoctorRepository;
import com.nit.repositery.PatientRepositer;

import jakarta.validation.Valid;

@Service
@Validated
public class DoctorServies implements IDoctorService {

	
	private DoctorRepository doctorRepository;
	private PatientRepositer patientRepositer;
	
	@Autowired
	public DoctorServies(DoctorRepository doctorRepository, PatientRepositer patientRepositer) {
		super();
		this.doctorRepository = doctorRepository;
		this.patientRepositer = patientRepositer;
	}

	@Override
	public List<Doctor> addDetaile(@Valid List<Doctor> doctors) {
		// TODO Auto-generated method stub
		//bidirectional
		doctors.forEach(doctor ->{
			doctor.getPatients().forEach(patient->{
				patient.setDoctor(doctor);
			});
		});
		return doctorRepository.saveAll(doctors);
	}

	@Override
	public List<Doctor> viewDoctorDetails() {
		// TODO Auto-generated method stub
		return doctorRepository.findAll();
	}

	@Override
	public List<Patient> viewPatientDetails() {
		// TODO Auto-generated method stub
		return patientRepositer.findAll();
	}

}
