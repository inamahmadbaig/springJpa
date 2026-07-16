package com.nit.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Component
@Data
@Entity(name = "Patient_Table")
public class Patient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
	@NotBlank(message = "patient Name cannot be empty")
	private String patientName;
	@NotBlank(message = "patient disease cannot be empty")
	private String disease;
	@NotNull(message = "age is required")
	private int age;
}
