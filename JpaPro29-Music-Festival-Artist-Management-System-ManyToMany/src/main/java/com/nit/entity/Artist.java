package com.nit.entity;

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
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@Table(name = "Artist_Festivals")
@NoArgsConstructor
@RequiredArgsConstructor
@Data
@Setter
@Getter
public class Artist {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long artistId;
	@NonNull
	private String artistName;
	@NonNull
	private String genre;
	@NonNull
	private String country;
	@NonNull
	private Integer experienceYears;
	@NonNull
	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE},fetch = FetchType.EAGER)
	@JoinTable(name = "artist_festival"
	,joinColumns = @JoinColumn(name = "artistId"),
	inverseJoinColumns = @JoinColumn(name = "festivalId")
	)
	@ToString.Exclude
	private List<Festival> festivals;
	
}
