package com.nit.repositer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nit.entity.Astronaut;

public interface AstronautRepository extends JpaRepository<Astronaut, Long> {

    // Finds an Astronaut by their own name
    List<Astronaut> findByAstronautName(String astronautName);
    
    // Finds all Astronauts participating in a specific Mission
    List<Astronaut> findBySpaceMissionsMissionName(String missionName);
}