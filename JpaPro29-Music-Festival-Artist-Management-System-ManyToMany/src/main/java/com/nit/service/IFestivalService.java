package com.nit.service;

import java.util.List;

import com.nit.entity.Artist;
import com.nit.entity.Festival;

import jakarta.validation.Valid;

public interface IFestivalService {

	public List<Festival> insertData(@Valid List<Festival> festivalsList1);
	public List<Festival> findyByFestivalName(String name);
	public List<Festival> findFestivalsByArtist(String artistsName);
	public Festival updateTicketPrice(Festival updatePrice);
	public void deleteFestival(Long id);
	public List<Festival> viewAllData();
}
