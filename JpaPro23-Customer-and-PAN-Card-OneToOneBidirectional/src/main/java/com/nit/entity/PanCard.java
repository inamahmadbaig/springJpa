package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity(name = "pancard_details")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class PanCard {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long panid;
	@NonNull
	private String panNumber;
	@NonNull
	private String issueDate;
	@OneToOne(mappedBy = "panCard")
	private Customer customer;
	
}
