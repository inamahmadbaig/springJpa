package com.nit.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.SpaceMission;
import com.nit.repositer.SpaceMissionRepository;

import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
@Service
@Validated
public class SpaceMissionService implements ISpaceMission {

	private SpaceMissionRepository missionRepository;
	
	public SpaceMissionService(SpaceMissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public List<SpaceMission> saveSpaceMission(@Valid List<SpaceMission> spaceMission) {
		// TODO Auto-generated method stub
		spaceMission.forEach(space->{
			if(space.getAstronauts() != null) {
				space.getAstronauts().forEach(astronaut->{
					if(astronaut.getSpaceMissions() == null) {
						astronaut.setSpaceMissions(new ArrayList<>());
					}
					astronaut.getSpaceMissions().add(space);
				});
			}
		});
		return missionRepository.saveAll(spaceMission);
	}

	@Override
	public List<SpaceMission> findByMissionName(String name) {
		// TODO Auto-generated method stub
		return missionRepository.findByMissionName(name);
	}

	@Override
	public List<SpaceMission> FindAllAstronautsParticipatingInSpecificMission(String specificMission) {
		// TODO Auto-generated method stub
		return missionRepository.findByAstronautsAstronautName(specificMission);
	}

	@Override
	public SpaceMission updateMissionDestination(SpaceMission destination) {
		// TODO Auto-generated method stub
		SpaceMission mission = missionRepository.findById(destination.getMissionId()).orElseThrow(()-> new IllegalArgumentException("id not found "+destination.getMissionId()));
		mission.setDestination(destination.getDestination());
		return missionRepository.save(mission);
	}

	@Transactional
	@Override
	public void deleteAnspaceMissionById(Long id) {
		// TODO Auto-generated method stub
		Optional<SpaceMission> opt = missionRepository.findById(id);
		if(opt.isPresent()) {
			SpaceMission mission = opt.get();
			// Remove relationship 
			mission.getAstronauts().forEach(astronaut->{
				astronaut.getSpaceMissions().remove(mission);
			});
			missionRepository.delete(mission);
			 System.out.println("Deleted SpaceMission with id : " + id);
		}else {
	        System.out.println("Astronaut not found with id : " + id);
	    }
	}

	@Override
	public String deleteAllMission() {
		// TODO Auto-generated method stub
		long count = missionRepository.count();
		if(count == 0) {
			return "No records found.";
		}
		List<SpaceMission> missions = missionRepository.findAll();

	    for (SpaceMission mission : missions) {
	        mission.getAstronauts().forEach(astronaut -> {
	            astronaut.getSpaceMissions().remove(mission);
	        });
	    }

	    missionRepository.deleteAll();

	    return count + " records deleted successfully.";
	
		
	}

	@Override
	public List<SpaceMission> displayAllSpaceMission() {
		// TODO Auto-generated method stub
		return missionRepository.findAll();
	}

	
}
