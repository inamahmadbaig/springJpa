package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Employee;

public interface IEmployeeInsert extends JpaRepository<Employee, Integer>{
	// JpaRepository already includes all Pagination and Sorting capabilities!
}
