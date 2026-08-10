package com.nit.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Hockey_Player_Tournament")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class HockeyPlayer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long playerId;
	@NonNull
	private String playerName;
	@NonNull
	private String teamName;
	@NonNull
	private String country;
	@NonNull
	private String role;
	@NonNull
	private Integer goals;
	@NonNull
	private Integer experience;
	
	@Version
	private Integer version;
	@CreationTimestamp
	private LocalDateTime createdAt;
	@UpdateTimestamp
	private LocalDateTime updatedAt;
}
