package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.VehicleInsurance;
import com.nit.repository.VehicleInsuranceRepository;

import jakarta.validation.Valid;

@Service
@Validated
public class VehicleInsuranceService implements IVehicleInsuranceService{

	@Autowired
	private VehicleInsuranceRepository insuranceRepository;

	@Override
	public void addPolicy(@Valid VehicleInsurance insurance) {
		insuranceRepository.save(insurance);
		
	}

	@Override
	public List<VehicleInsurance> addMultiplePolicies(@Valid List<VehicleInsurance> insuranceList) {
		
		return insuranceRepository.saveAll(insuranceList);
	}

	@Override
	public VehicleInsurance getPolicyById(Long id) {
		// TODO Auto-generated method stub
		return insuranceRepository.findById(id).orElseThrow(()-> new RuntimeException("insurens id not found "+id));
	}

	@Override
	public VehicleInsurance updatePolicy(VehicleInsurance insurance) {
		VehicleInsurance vehicle = insuranceRepository.findById(insurance.getInsuranceId()).orElseThrow(()-> new RuntimeException("insurens id not found "+insurance.getInsuranceId()));
		vehicle.setVehicleNumber(insurance.getVehicleNumber());
		vehicle.setOwnerName(insurance.getOwnerName());
		vehicle.setInsuranceCompany(insurance.getInsuranceCompany());
		vehicle.setPremiumAmount(insurance.getPremiumAmount());
		
		return insuranceRepository.save(vehicle);
	}

	@Override
	public void deletePolicy(Long id) {
		insuranceRepository.deleteById(id);
		
	}

	@Override
	public void deleteAllPolicies() {
		insuranceRepository.deleteAll();
		
	}

	@Override
	public long countPolicies() {
		// TODO Auto-generated method stub
		return insuranceRepository.count();
	}

	@Override
	public boolean policyExists(Long id) {
		// TODO Auto-generated method stub
		return insuranceRepository.existsById(id);
	}

	@Override
	public Iterable<VehicleInsurance> getAllPolicies() {
		return insuranceRepository.findAll();
	}
	
}
