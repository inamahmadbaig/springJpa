package com.nit.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data

@RequiredArgsConstructor
@Table(name = "Hotel_Booking_System")
public class Booking {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long bookingId;
	@NotNull
	private String guestName;
	@NotNull
	private String roomType;
	@NotNull
	private String city;
	@NotNull
	@Positive
	private Double bookingAmount;
	@NotNull
	private Integer numberOfDays;
	@NotNull
	private LocalDate bookingDate;
	@NotNull
	private String bookingStatus;
}
