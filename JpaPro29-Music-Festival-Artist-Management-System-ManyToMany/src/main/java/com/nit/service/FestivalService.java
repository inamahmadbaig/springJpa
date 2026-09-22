package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Festival;
import com.nit.repository.FestivalRepository;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@Service
@Validated
public class FestivalService implements IFestivalService {

	@Autowired
	private FestivalRepository festivalRepositoryl;
	@Override
	public List<Festival> insertData(@Valid List<Festival> festivals) {
	    
	    // 1. Loop through each festival in the list
	    festivals.forEach(festival -> {
	        
	        // 2. Prevent crashes if the festival has no artists yet
	        if (festival.getArtists() != null) {
	            
	            // 3. Loop through the artists of THIS specific festival
	            festival.getArtists().forEach(artist -> {
	                // 4. Link the current festival to the artist
	                artist.getFestivals().add(festival); 
	            });
	        }
	    });

	    // 5. Save all at once (typo fixed!)
	    return festivalRepositoryl.saveAll(festivals);
	}

	@Override
	public List<Festival> findyByFestivalName(String name) {
	    return festivalRepositoryl.findByFestivalName(name);
	}

	
	@Override
	public List<Festival> findFestivalsByArtist(String artistsName) {
	    return festivalRepositoryl.findByArtistsArtistName(artistsName);
	}

	@Override
	public Festival updateTicketPrice(Festival updatePrice) {
		Festival festival = festivalRepositoryl.findById(updatePrice.getFestivalId()).orElseThrow(()-> new EntityNotFoundException("Festival not found with ID: " + updatePrice.getFestivalId()));
		festival.setTicketPrice(updatePrice.getTicketPrice());
		return festivalRepositoryl.save(festival);
	}

	@Transactional
	@Override
	public void deleteFestival(Long id) {
		
		Festival festival = festivalRepositoryl.findById(id).orElseThrow(()-> new EntityNotFoundException("festival Not Found"));
		festival.getArtists().forEach(artist->{
			artist.getFestivals().remove(festival);
		});
		
		festivalRepositoryl.deleteById(id);
	}

	@Override
	public List<Festival> viewAllData() {
		// TODO Auto-generated method stub
		return festivalRepositoryl.findAll();
	}

}
