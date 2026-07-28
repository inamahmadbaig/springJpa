package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Entity
@Data
public class VehicleInsurance {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long insuranceId;
	@NotNull
	private String vehicleNumber;
	@NotNull
	private String ownerName; 
	@NotNull
	private String insuranceCompany;
	@NotNull
	@Positive
	private Double premiumAmount;
}
