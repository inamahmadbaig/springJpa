package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Astronaut;
import com.nit.entity.SpaceMission;
import com.nit.repositer.AstronautRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;

@Service
@Validated
public class AstronautServic implements IAstronautServic {
	
	@Autowired
	private AstronautRepository astronautRepository;
	
	

	@Override
	public List<Astronaut> saveAstronaut(@Valid List<Astronaut> astronauts) {
		// TODO Auto-generated method stub
		astronauts.forEach(astronaut->{
			astronaut.getSpaceMissions().forEach(missionSpace->{
				if (missionSpace.getAstronauts() == null) {
					missionSpace.setAstronauts(new ArrayList<>());
				}
				missionSpace.getAstronauts().add(astronaut);
			});
		});
		return astronautRepository.saveAll(astronauts);
	}

	@Override
	public List<Astronaut> findByAstronautName(String name) {
		// TODO Auto-generated method stub
		return astronautRepository.findByAstronautName(name);
	}

	@Override
	public List<Astronaut> findAllMissionsAssignedToAspecificAstronaut(String specificName) {
		// TODO Auto-generated method stub
		return astronautRepository.findBySpaceMissionsMissionName(specificName);
	}

	@Override
	public Astronaut UpdateAstronautTotalFlights(Astronaut totalFlights) {
		// TODO Auto-generated method stub
		Astronaut astronaut = astronautRepository.findById(totalFlights.getAstronautId()).orElseThrow(()-> new IllegalArgumentException("id not found "+totalFlights.getAstronautId()));
		astronaut.setTotalFlights(totalFlights.getTotalFlights());
		return astronautRepository.save(astronaut);
	}

	@Transactional
	@Override
	public void deleteAnAstronautById(Long id) {

	    Optional<Astronaut> opt = astronautRepository.findById(id);

	    if (opt.isPresent()) {

	        Astronaut astronaut = opt.get();

	        // Remove relationship from Mission side
	        astronaut.getSpaceMissions().forEach(mission -> {
	            mission.getAstronauts().remove(astronaut);
	        });

	        astronautRepository.delete(astronaut);

	        System.out.println("Deleted Astronaut with id : " + id);

	    } else {
	        System.out.println("Astronaut not found with id : " + id);
	    }
	}

	@Override
	public String deleteAll() {
		// TODO Auto-generated method stub
		 long count = astronautRepository.count();

		    if (count == 0) {
		        return "No records found.";
		    }
		    List<Astronaut> astronauts = astronautRepository.findAll();
		    
		    for(Astronaut m : astronauts) {
		    	m.getSpaceMissions().forEach(space->{
		    		space.getAstronauts().remove(m);
		    	});
		    }

		astronautRepository.deleteAll();
		return count+" delete all data";
	}

	@Override
	public List<Astronaut> displayAllAstronauts() {
		// TODO Auto-generated method stub
		return astronautRepository.findAll();
	}

}
