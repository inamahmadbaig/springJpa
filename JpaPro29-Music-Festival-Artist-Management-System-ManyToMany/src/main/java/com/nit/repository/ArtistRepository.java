package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Artist;

public interface ArtistRepository extends JpaRepository<Artist, Long> {

	  List<Artist> findByArtistName(String artistName);

	    List<Artist> findByFestivalsFestivalName(String festivalName);
	
}
