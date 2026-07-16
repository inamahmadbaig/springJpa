package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;

import com.nit.entity.Patient;

public interface IPatientService {

	public void registerPatient(Iterable<Patient> patients);
	public Optional<Patient> viewById(int id);
	public Iterable<Patient> viewAllPatient();
	public Page<Patient> getByPage(int pageNumber, int pageSize );
}
