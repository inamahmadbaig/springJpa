package com.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Entity
@Setter
@Getter
@RequiredArgsConstructor
@Data

public class Medicine {

	@Id
	@SequenceGenerator(name = "med",sequenceName = "M_ID",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "med",strategy = GenerationType.SEQUENCE)
	private Long medicineId;
	@NonNull
	private String medicineName;
	@NonNull
	private String category;
	@NonNull
	private String manufacturer;
	@NonNull
	@Positive
	private Double price ;
	@NonNull
	@Positive
	private Integer stockQuantity;
	@NonNull
	private LocalDate expiryDate;
	@NonNull
	private Double rating;
	
	public Medicine() {
		System.out.println("Medicine.Medicine()");
	}
}
