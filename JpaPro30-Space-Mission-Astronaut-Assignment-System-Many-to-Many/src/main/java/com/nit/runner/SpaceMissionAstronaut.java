package com.nit.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Astronaut;
import com.nit.entity.SpaceMission;
import com.nit.service.IAstronautServic;
import com.nit.service.ISpaceMission;
@Component
public class SpaceMissionAstronaut implements CommandLineRunner {

	@Autowired
	private IAstronautServic astronautServic;
	@Autowired
	private ISpaceMission iSpaceMission;
	private static final Logger log = LoggerFactory.getLogger(SpaceMissionAstronaut.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*try {
			System.out.println("add data ");
			log.info("data insert ");
			Astronaut a1 = new Astronaut("Rakesh Sharma", "Pilot", "Indian", "1");
			Astronaut a2 = new Astronaut("Sunita Williams", "Flight Engineer", "American", "3");
			Astronaut a3 = new Astronaut("Neil Armstrong", "Commander", "American", "2");
			Astronaut a4 = new Astronaut("Kalpana Chawla", "Mission Specialist", "Indian-American", "2");
		
			SpaceMission m1 = new SpaceMission("Apollo 11", "1969", "Moon", "8 Days");
			SpaceMission m2 = new SpaceMission("ISS Expedition 32", "2012", "International Space Station", "127 Days");
			SpaceMission m3 = new SpaceMission("Soyuz T-11", "1984", "Salyut 7 Space Station", "8 Days");
			SpaceMission m4 = new SpaceMission("Artemis I", "2022", "Moon Orbit", "25 Days");
			// Astronaut -> Mission
			a1.getSpaceMissions().add(m1);
			a1.getSpaceMissions().add(m2);
		
			a2.getSpaceMissions().add(m2);
			a2.getSpaceMissions().add(m4);
		
			a3.getSpaceMissions().add(m4);
		
			a4.getSpaceMissions().add(m3);
			a4.getSpaceMissions().add(m1);
		
			// Mission -> Astronaut
			m1.getAstronauts().add(a1);
			m1.getAstronauts().add(a4);
		
			m2.getAstronauts().add(a1);
			m2.getAstronauts().add(a2);
		
			m3.getAstronauts().add(a4);
		
			m4.getAstronauts().add(a2);
			m4.getAstronauts().add(a3);
			
			//invoke b. method
			astronautServic.saveAstronaut(List.of(a1,a2,a3,a4));
			System.out.println("sava all data ");
			log.info("sava data successfull");
			
			
		} catch (Exception e) {
			log.error("Exception aaya ",e);
			e.printStackTrace();
			// TODO: handle exception
		}*/
		
		/*try {
			log.info("Find Astronaut by astronautName.");
			System.out.println("Find Astronaut by astronautName.");
			astronautServic.findByAstronautName("Neil Armstrong").forEach(System.out::println);
			log.info("see this details");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println("Find Mission by missionName.");
			iSpaceMission.findByMissionName("Apollo 11").forEach(System.out::println);
			log.info("success");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println(" Find all Missions ka naam dalna h assigned to a specific Astronaut");
			astronautServic.findAllMissionsAssignedToAspecificAstronaut("Apollo 11").forEach(System.out::println);
			log.info("see data");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println("Find all yaha  Astronauts kaa naame participating in a specific Mission.");
			iSpaceMission.FindAllAstronautsParticipatingInSpecificMission("Sunita Williams").forEach(System.out::println);
			log.info("see data");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println(" Update Mission destination");
			SpaceMission mission = new SpaceMission();
			mission.setMissionId(2l);
			mission.setDestination("Moon");
			iSpaceMission.updateMissionDestination(mission);
			log.info("see data");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println("Update Astronaut totalFlights.");
			Astronaut astronautUpdate = new Astronaut();
			astronautUpdate.setAstronautId(1l);
			astronautUpdate.setTotalFlights("2");
			//invoke b. method
			astronautServic.UpdateAstronautTotalFlights(astronautUpdate);
			
			log.info("successfull...");
		} catch (Exception e) {
			log.error("Exception ",e.getMessage());
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println(" Delete an Astronaut.");
			astronautServic.deleteAnAstronautById(3l);
			log.info("delete successfull...");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println(" Delete a Space Mission");
			iSpaceMission.deleteAnspaceMissionById(4l);
			log.info("delete successfull...");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		
		/*try {
			System.out.println("Display all Astronauts.");
			astronautServic.displayAllAstronauts().forEach(System.out::println);
			log.info("successfull...");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		
		try {
			System.out.println("Display all Space Missions");
			iSpaceMission.displayAllSpaceMission().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
