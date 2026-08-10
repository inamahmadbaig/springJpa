package com.nit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.nit.entity.HockeyPlayer;

import jakarta.transaction.Transactional;

public interface HockeyPlayerRepository extends JpaRepository<HockeyPlayer, Long> {
	
	
	@Query("SELECT h FROM HockeyPlayer h WHERE h.teamName = :team")
	List<HockeyPlayer> findByTeamName(@Param("team") String team);
	@Query("SELECT h FROM HockeyPlayer h WHERE h.goals > :goals")
	List<HockeyPlayer> findPlayersWithGoalsGreaterThan(@Param("goals") Integer goals);
	@Query("SELECT h FROM HockeyPlayer h WHERE h.role = :role AND h.country = :country")
	List<HockeyPlayer> findByRoleAndCountry(@Param("role") String role,
	                                        @Param("country") String country);
	@Query("SELECT h FROM HockeyPlayer h WHERE h.playerName LIKE %:keyword%")
	List<HockeyPlayer> findByNameContains(@Param("keyword") String keyword);
	@Query("SELECT h FROM HockeyPlayer h WHERE h.experience BETWEEN :minExp AND :maxExp")
	List<HockeyPlayer> findByExperienceBetween(@Param("minExp") Integer minExp,
	                                           @Param("maxExp") Integer maxExp);
	@Query("SELECT COUNT(h) FROM HockeyPlayer h WHERE h.teamName = :team")
	Long countPlayersByTeam(@Param("team") String team);
	@Query("SELECT h FROM HockeyPlayer h ORDER BY h.goals DESC")
	List<HockeyPlayer> findPlayersOrderByGoalsDesc();
	@Modifying
	@Transactional
	@Query("UPDATE HockeyPlayer h SET h.goals = :goals WHERE h.playerId = :id")
	Long updateGoals(@Param("id") int id,@Param("goals") Integer goals);
	@Modifying
	@Transactional
	@Query("DELETE FROM HockeyPlayer h WHERE h.country = :country")
	Long deleteByCountry(@Param("country") String country);
	@Query("SELECT h.playerName, h.goals FROM HockeyPlayer h")
	List<Object[]> getPlayerNameAndGoals();

}
