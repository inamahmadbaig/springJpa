package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Student;
import com.nit.repository.StudentRepository;

import jakarta.validation.Valid;
@Service
@Validated
public class StudentService implements IStudentService {

	@Autowired
	private StudentRepository repository;
	@Override
	public List<Student> addStudentDetails(@Valid List<Student> students) {
		// TODO Auto-generated method stub
		return repository.saveAll(students);
	}

	@Override
	public List<Student> viewStudent() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
