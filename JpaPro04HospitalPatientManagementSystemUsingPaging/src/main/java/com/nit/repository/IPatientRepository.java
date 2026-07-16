package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.nit.entity.Patient;

public interface IPatientRepository extends JpaRepository<Patient, Integer> {

}
