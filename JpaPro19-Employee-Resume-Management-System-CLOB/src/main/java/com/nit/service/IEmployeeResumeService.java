package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.EmployeeResume;

public interface IEmployeeResumeService {

	public List<EmployeeResume> saveEmp(List<EmployeeResume> employeeResumes );
	public Optional<EmployeeResume> viewEmpById(Long id);
	public List<EmployeeResume> viewAllEmp();
	public void deletEmpById(Long id);
}
