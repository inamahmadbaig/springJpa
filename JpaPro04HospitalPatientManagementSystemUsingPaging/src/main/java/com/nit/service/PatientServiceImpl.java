package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.nit.entity.Patient;
import com.nit.repository.IPatientRepository;
@Service
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private IPatientRepository iPatientRepository;
	@Override
	public void registerPatient(Iterable<Patient> patients) {
		// TODO Auto-generated method stub
		iPatientRepository.saveAll(patients);
	}

	@Override
	public Optional<Patient> viewById(int id) {
		// TODO Auto-generated method stub
		return iPatientRepository.findById(id);
	}

	@Override
	public Page<Patient> getByPage(int pageNumber, int pageSize) {
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		return iPatientRepository.findAll(pageable);
	}

	@Override
	public Iterable<Patient> viewAllPatient() {
		// TODO Auto-generated method stub
		return iPatientRepository.findAll();
	}

}
