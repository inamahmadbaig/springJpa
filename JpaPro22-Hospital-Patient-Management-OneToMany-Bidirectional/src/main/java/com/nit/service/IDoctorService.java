package com.nit.service;

import java.util.List;

import com.nit.entity.Doctor;
import com.nit.entity.Patient;

import jakarta.validation.Valid;

public interface IDoctorService {

	public List<Doctor> addDetaile(@Valid List<Doctor> doctors);
	public List<Doctor> viewDoctorDetails();
	public List<Patient> viewPatientDetails();
}
