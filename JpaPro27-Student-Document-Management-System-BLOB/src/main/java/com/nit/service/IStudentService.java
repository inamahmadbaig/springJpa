package com.nit.service;

import java.util.List;

import com.nit.entity.Student;

import jakarta.validation.Valid;

public interface IStudentService {

	public List<Student> addStudentDetails(@Valid List<Student> students);
	public List<Student> viewStudent();
	
}
