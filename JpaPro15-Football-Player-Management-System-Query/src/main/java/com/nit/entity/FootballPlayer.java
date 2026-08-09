package com.nit.entity;


import java.time.LocalDateTime;

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

@Entity
@Table(name = "FootballPlayer_Managment")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class FootballPlayer {

	@Id
	@SequenceGenerator(
		    name = "player_seq",
		    sequenceName = "player_seq",
		    initialValue = 100,
		    allocationSize = 1
		)
		@GeneratedValue(
		    strategy = GenerationType.SEQUENCE,
		    generator = "player_seq"
		)
	private Long playerId;
	@NonNull
	private String playerName;
	@NonNull
	private String country;
	@NonNull
	private String club;
	@NonNull
	private String position;
	@NonNull
	private Double salary;
	@NonNull
	private Integer jerseyNumber;
	
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
