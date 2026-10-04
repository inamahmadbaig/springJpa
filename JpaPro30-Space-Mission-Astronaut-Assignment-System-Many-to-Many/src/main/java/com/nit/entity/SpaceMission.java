package com.nit.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "SpaceMission")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class SpaceMission {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long missionId;
	@NonNull
	private String missionName;
	@NonNull
	private String launchYear;
	@NonNull
	private String destination;
	@NonNull
	private String missionDuration;
	
	@ManyToMany(mappedBy = "spaceMissions")
	private List<Astronaut> astronauts = new ArrayList<>();;
	@Override
	public String toString() {
		return "SpaceMission [missionId=" + missionId + ", missionName=" + missionName + ", launchYear=" + launchYear
				+ ", destination=" + destination + ", missionDuration=" + missionDuration + 
				 "]";
	}
	
	
	
	
}
