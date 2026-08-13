package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.EmployeeResume;

public interface EmployeeResumeRepository extends JpaRepository<EmployeeResume, Long> {

}
