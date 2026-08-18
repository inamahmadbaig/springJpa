package com.nit.service;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.University;
import com.nit.repository.UniversityRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
@Validated
@Transactional
public class UniversityCourseService implements IUniversityCourseService {

	@Autowired
	private UniversityRepository repository;
	@Override
	public Iterable<University> addUniversityDetais(@Valid Iterable<University> list) {
		// TODO Auto-generated method stub
		return repository.saveAll(list);
	}

	@Override
	public Iterable<University> showAllData() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

}
