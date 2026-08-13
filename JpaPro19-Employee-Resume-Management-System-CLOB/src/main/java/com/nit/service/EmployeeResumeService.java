package com.nit.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.nit.entity.EmployeeResume;
import com.nit.repository.EmployeeResumeRepository;
@Service
public class EmployeeResumeService implements IEmployeeResumeService {

	private EmployeeResumeRepository employeeResumeRepository;
	
	public EmployeeResumeService(EmployeeResumeRepository employeeResumeRepository) {
		super();
		this.employeeResumeRepository = employeeResumeRepository;
	}

	@Override
	public List<EmployeeResume> saveEmp(List<EmployeeResume> employeeResumes) {
		// TODO Auto-generated method stub
		return employeeResumeRepository.saveAll(employeeResumes);
	}

	@Override
	public Optional<EmployeeResume> viewEmpById(Long id) {
		// TODO Auto-generated method stub
		Optional<EmployeeResume> emp = employeeResumeRepository.findById(id);

		if (emp.isPresent()) {
		    System.out.println(emp.get());
		}
			
			return emp;
		}
		
	

	@Override
	public List<EmployeeResume> viewAllEmp() {
		// TODO Auto-generated method stub
		return employeeResumeRepository.findAll();
	}

	@Override
	public void deletEmpById(Long id) {
		// TODO Auto-generated method stub

		employeeResumeRepository.deleteById(id);
	}

}
