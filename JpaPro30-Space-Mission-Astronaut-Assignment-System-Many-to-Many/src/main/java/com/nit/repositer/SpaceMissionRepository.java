package com.nit.repositer;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.nit.entity.SpaceMission;

public interface SpaceMissionRepository extends JpaRepository<SpaceMission, Long> {

    // Finds all Missions assigned to a specific Astronaut
    List<SpaceMission> findByAstronautsAstronautName(String astronautName);
    
    // Finds a specific Mission by its own name
    List<SpaceMission> findByMissionName(String missionName);
}