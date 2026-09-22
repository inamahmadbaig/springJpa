package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Artist;
import com.nit.entity.Festival;

public interface FestivalRepository extends JpaRepository<Festival, Long> {


//
// Find Festival by festivalName
	List<Festival> findByFestivalName(String festivalName);

// Find all Festivals attended by a particular Artist
	List<Festival> findByArtistsArtistName(String artistName);
}
