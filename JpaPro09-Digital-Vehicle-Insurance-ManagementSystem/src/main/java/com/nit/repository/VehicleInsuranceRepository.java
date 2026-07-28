package com.nit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.VehicleInsurance;

public interface VehicleInsuranceRepository extends JpaRepository<VehicleInsurance, Long> {

}
