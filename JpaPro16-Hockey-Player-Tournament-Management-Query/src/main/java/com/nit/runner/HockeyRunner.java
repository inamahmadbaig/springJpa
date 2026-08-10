package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.HockeyPlayer;
import com.nit.repository.HockeyPlayerRepository;
@Component
public class HockeyRunner implements CommandLineRunner {

	@Autowired
	private HockeyPlayerRepository hockeyPlayerRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*try {
			List<HockeyPlayer> players = List.of(

				    new HockeyPlayer("Manpreet Singh", "India", "India", "Midfielder", 35, 12),
				    new HockeyPlayer("Harmanpreet Singh", "India", "India", "Defender", 52, 10),
				    new HockeyPlayer("PR Sreejesh", "India", "India", "Goalkeeper", 0, 18),
				    new HockeyPlayer("Thierry Brinkman", "Netherlands", "Netherlands", "Forward", 68, 9),
				    new HockeyPlayer("Jip Janssen", "Netherlands", "Netherlands", "Defender", 45, 7),
				    new HockeyPlayer("Tom Boon", "Belgium", "Belgium", "Forward", 120, 14),
				    new HockeyPlayer("Arthur Van Doren", "Belgium", "Belgium", "Defender", 18, 13),
				    new HockeyPlayer("Tim Brand", "Australia", "Australia", "Forward", 40, 8),
				    new HockeyPlayer("Blake Govers", "Australia", "Australia", "Forward", 75, 11),
				    new HockeyPlayer("Zach Wallace", "England", "England", "Midfielder", 28, 6)

				);
			hockeyPlayerRepository.saveAll(players);
			System.err.println("save all players");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("findByTeamName");
			hockeyPlayerRepository.findByTeamName("India").forEach(System.out::println);
		} catch (Exception e) {
			
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("findPlayersWithGoalsGreaterThan");
			hockeyPlayerRepository.findPlayersWithGoalsGreaterThan(40).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("findByRoleAndCountry");
			hockeyPlayerRepository.findByRoleAndCountry("Forward", "Australia").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("findByNameContains");
			hockeyPlayerRepository.findByNameContains("T").forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			System.out.println("findByExperienceBetween");
			hockeyPlayerRepository.findByExperienceBetween(3, 15).forEach(System.out::println);
		} catch (Exception e) {
			e.addSuppressed(e);
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("countPlayersByTeam");
			System.out.println("count -> "+hockeyPlayerRepository.countPlayersByTeam("india"));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("findPlayersOrderByGoalsDesc");
			hockeyPlayerRepository.findPlayersOrderByGoalsDesc().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("updateGoals");
			long count =hockeyPlayerRepository.updateGoals(2, 1004);
			System.err.println("update "+count);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("deleteByCountry");
			long delete = hockeyPlayerRepository.deleteByCountry("England");
			System.err.println("Deleter by counter "+delete);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("getPlayerNameAndGoals");
			List<Object[]> players = hockeyPlayerRepository.getPlayerNameAndGoals();
			for(Object[] p : players) {
				System.out.println("Player name -> "+p[0]);
				System.out.println("Total Goal  -> "+p[1]);
				System.out.println("----------------------");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		*/
		
		try {
			System.out.println("updateGoals");
			HockeyPlayer player = hockeyPlayerRepository.findById(6l).get();
			player.setGoals(004);
			hockeyPlayerRepository.save(player);
			System.out.println("upadet version "+player);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
