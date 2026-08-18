package com.nit.service;

import java.util.List;

import com.nit.entity.University;

import jakarta.validation.Valid;

public interface IUniversityCourseService {

	public Iterable<University> addUniversityDetais(@Valid Iterable<University> list);
	public Iterable<University> showAllData();
}
