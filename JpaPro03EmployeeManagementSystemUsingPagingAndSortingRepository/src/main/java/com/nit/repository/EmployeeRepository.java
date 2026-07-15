package com.nit.repository;



import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Employee;

public interface EmployeeRepository extends PagingAndSortingRepository<Employee, Integer> {

	

}
