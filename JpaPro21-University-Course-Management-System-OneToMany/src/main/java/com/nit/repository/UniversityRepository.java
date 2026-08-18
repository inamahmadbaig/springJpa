package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.University;

public interface UniversityRepository extends JpaRepository<University, Long> {

}
