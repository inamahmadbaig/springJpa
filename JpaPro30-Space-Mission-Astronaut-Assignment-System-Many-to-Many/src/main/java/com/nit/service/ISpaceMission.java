package com.nit.service;

import java.util.List;

import com.nit.entity.SpaceMission;

import jakarta.validation.Valid;

public interface ISpaceMission {

	public List<SpaceMission> saveSpaceMission(@Valid List<SpaceMission> spaceMission);
	public List<SpaceMission> findByMissionName(String name);
	public List<SpaceMission> FindAllAstronautsParticipatingInSpecificMission(String specificMission);
	public SpaceMission  updateMissionDestination(SpaceMission destination);
	public void deleteAnspaceMissionById(Long id);
	public String deleteAllMission();
	public List<SpaceMission>  displayAllSpaceMission();
	
}
