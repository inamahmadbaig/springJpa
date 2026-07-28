package com.nit.service;

import java.util.List;

import com.nit.entity.VehicleInsurance;

import jakarta.validation.Valid;

public interface IVehicleInsuranceService {

	public void  addPolicy(@Valid VehicleInsurance insurance);
	public List<VehicleInsurance> addMultiplePolicies(@Valid List<VehicleInsurance> insuranceList);
	public Iterable<VehicleInsurance> getAllPolicies();
	public VehicleInsurance getPolicyById(Long id);
	public VehicleInsurance  updatePolicy(@Valid VehicleInsurance insurance);
	public void  deletePolicy(Long id);
	public void  deleteAllPolicies();
	public long countPolicies();
	public boolean  policyExists(Long id);
}
