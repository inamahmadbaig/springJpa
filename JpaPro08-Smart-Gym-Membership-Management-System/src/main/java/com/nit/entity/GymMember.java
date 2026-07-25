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
public class GymMember {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long memberId;
	 @NotNull
	 private String memberName;
	 @NotNull
	 private String membershipType;
	 @NotNull
	 private Integer membershipDuration;
	 @NotNull
	 @Positive
	 private Double fees;
}
