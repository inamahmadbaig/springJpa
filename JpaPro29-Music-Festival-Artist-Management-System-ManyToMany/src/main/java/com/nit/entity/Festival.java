package com.nit.entity;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "Festival_Artist")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
public class Festival {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long festivalId;
	@NonNull
	private String festivalName;
	@NonNull
	private String city;
	@NonNull
	private String eventDate;
	@NonNull
	private Double ticketPrice;
	@NonNull
	@ManyToMany(mappedBy = "festivals")
	@ToString.Exclude
	private List<Artist> artists;
	@Override
	public String toString() {
		return "Festival [festivalId=" + festivalId + ", festivalName=" + festivalName + ", city=" + city
				+ ", eventDate=" + eventDate + ", ticketPrice=" + ticketPrice +  "]";
	}
	//artists -> is ko tostring se remove karne pr hi print hoga data
	
}
