package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Artist;
import com.nit.repository.ArtistRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@Service
@Validated
public class ArtistService implements IArtistService {

	@Autowired
	private ArtistRepository artistRepository;
	@Override
	public List<Artist> insertData(@Valid List<Artist> artists) {
		
		artists.forEach(artist->{
			if(artist.getFestivals() !=null) {
				artist.getFestivals().forEach(festival->{
					festival.getArtists().add(artist);
				});
			}
		});
		return artistRepository.saveAll(artists);
	}

	@Override
	public List<Artist> findyByName(String name) {
		// TODO Auto-generated method stub
		return artistRepository.findByArtistName(name);
	}

	@Override
	public List<Artist> findArtistsByFestival(String festival) {
		// TODO Auto-generated method stub
		return artistRepository.findByFestivalsFestivalName(festival);
	}

	@Override
	public Artist updateExperienceYears(Artist experienceYears) {
		Artist artist = artistRepository.findById(experienceYears.getArtistId()).orElseThrow(()-> new EntityNotFoundException("Festival not found with ID: " + experienceYears.getArtistId()));
		artist.setExperienceYears(experienceYears.getExperienceYears());
		return artistRepository.save(artist);
	}

	@Transactional
	@Override
	public void deleteArtist(Long id) {
		Artist artist= artistRepository.findById(id).orElseThrow(()-> new EntityNotFoundException("Artist Not Found"));
		artist.getFestivals().forEach(fest->{
			fest.getArtists().remove(artist);
		});
		artistRepository.deleteById(id);
	}

	@Override
	public List<Artist> viewAllData() {
		// TODO Auto-generated method stub
		return artistRepository.findAll();
	}

}
