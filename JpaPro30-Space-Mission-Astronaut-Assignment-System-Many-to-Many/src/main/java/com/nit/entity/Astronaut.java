package com.nit.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "Astronaut")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Astronaut {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long astronautId;
	@NonNull
	private String astronautName;
	@NonNull
	private String specialization;
	@NonNull
	private String nationality;
	@NonNull
	private String totalFlights;
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinTable(
	        name = "astronaut_mission",
	        joinColumns = @JoinColumn(name = "astronaut_id"),
	        inverseJoinColumns = @JoinColumn(name = "mission_id")
	    )
	private List<SpaceMission> spaceMissions = new ArrayList<>();;
	@Override
	public String toString() {
		return "Astronaut [astronautId=" + astronautId + ", astronautName=" + astronautName + ", specialization="
				+ specialization + ", nationality=" + nationality + ", totalFlights=" + totalFlights
				+  "]";
	}
	
	
	
}
