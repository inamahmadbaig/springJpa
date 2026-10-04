package com.nit.service;

import java.util.List;

import com.nit.entity.Astronaut;

import jakarta.validation.Valid;

public interface IAstronautServic {

	public List<Astronaut> saveAstronaut(@Valid List<Astronaut> astronauts);
	public List<Astronaut> findByAstronautName(String name);
	public List<Astronaut>  findAllMissionsAssignedToAspecificAstronaut(String specificName);
	public Astronaut  UpdateAstronautTotalFlights(Astronaut totalFlights);
	public void deleteAnAstronautById(Long id);
	public String deleteAll();
	public List<Astronaut>  displayAllAstronauts();
	
}
