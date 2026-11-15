package com.nit.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@Data
@Table(name = "Doctor_Management_System")
@RequiredArgsConstructor
public class Doctor {

	@Id
	@SequenceGenerator(
		    name = "doctor_seq",
		    sequenceName = "doctor_seq",
		    initialValue = 100,
		    allocationSize = 1
		)
		@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "doctor_seq"
		)
	private Long doctorId;
	@NonNull
	private String doctorName;
	@NonNull
	private String specialization;
	@NonNull
	private String hospitalName;
	@NonNull
	private String city;
	@NonNull
	private Double consultationFee;
	@NonNull
	private Integer experience;
	@NonNull
	private String email;
	
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDate  createdTime;
	@UpdateTimestamp
	private LocalDate  updatedAtTime;
	
	
}
