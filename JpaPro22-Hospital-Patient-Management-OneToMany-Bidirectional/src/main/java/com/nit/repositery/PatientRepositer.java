package com.nit.repositery;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Patient;

public interface PatientRepositer extends JpaRepository<Patient, Long> {

}
