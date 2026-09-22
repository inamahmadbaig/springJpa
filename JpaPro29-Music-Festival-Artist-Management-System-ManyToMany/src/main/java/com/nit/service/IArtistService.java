package com.nit.service;

import java.util.List;

import com.nit.entity.Artist;

import jakarta.validation.Valid;

public interface IArtistService {

	public List<Artist> insertData(@Valid List<Artist> artists);
	public List<Artist> findyByName(String name);
	public List<Artist> findArtistsByFestival(String festival);
	public Artist updateExperienceYears(Artist experienceYears);
	public void deleteArtist(Long id);
	public List<Artist> viewAllData();
}
