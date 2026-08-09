package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.FootballPlayer;

import jakarta.transaction.Transactional;

public interface FootballPlayerRepository extends JpaRepository<FootballPlayer, Long> {

	@Query("SELECT f FROM FootballPlayer f WHERE f.club = :club")
	public List<FootballPlayer> findByClub(@Param("club") String club);
	
	@Query("SELECT f FROM FootballPlayer f WHERE f.salary > :salary")
	public List<FootballPlayer> findPlayersWithSalaryGreaterThan(@Param("salary") Double salary);
	
	@Query("SELECT f FROM FootballPlayer f WHERE f.position = :position AND f.country = :country")
	public List<FootballPlayer> findByPositionAndCountry(@Param("position") String position, @Param("country") String country);
	
	
	@Query("SELECT f FROM FootballPlayer f WHERE f.playerName LIKE CONCAT(:prefix, '%')")
	public List<FootballPlayer> findByNameStartsWith(@Param("prefix") String prefix);
	
	@Query("SELECT f FROM FootballPlayer f WHERE f.jerseyNumber BETWEEN :start AND :end")
	public List<FootballPlayer> findByJerseyNumberBetween(@Param("start") Integer start,
	                                               @Param("end") Integer end);
	@Query("SELECT COUNT(f) FROM FootballPlayer f WHERE f.country = :country")
	public Long countPlayersByCountry(@Param("country") String country);
	
	@Query("SELECT f FROM FootballPlayer f ORDER BY f.salary DESC")
	public List<FootballPlayer> findHighestPaidPlayers();
	
	
	@Modifying
	@Transactional
	@Query("UPDATE FootballPlayer f SET f.salary = :salary WHERE f.playerId = :id")
	public Long updateSalary(@Param("id") int id,@Param("salary") Double salary);
	@Modifying
	@Transactional
	@Query("DELETE FROM FootballPlayer f WHERE f.club = :club")
	public Long deleteByClub(@Param("club") String club);
	@Query("SELECT f.playerName, f.club FROM FootballPlayer f")
	public List<Object[]> getPlayerNameAndClub();
}
