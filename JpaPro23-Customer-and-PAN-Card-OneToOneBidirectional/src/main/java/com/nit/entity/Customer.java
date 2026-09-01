package com.nit.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity(name = "customer_onetoone")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerId;
	@NonNull
	private String customerName;
	@NonNull
	private String email;
	@NonNull
	private String city;
	@NonNull
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "panid")
	private PanCard panCard;
	
}
