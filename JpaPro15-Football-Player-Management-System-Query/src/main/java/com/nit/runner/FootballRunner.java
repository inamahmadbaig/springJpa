package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.FootballPlayer;
import com.nit.repository.FootballPlayerRepository;

@Component
public class FootballRunner implements CommandLineRunner {

	@Autowired
	private FootballPlayerRepository footballPlayerRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		try {
			System.out.println("Insert playare data ");
			List<FootballPlayer> list = List.of(
					new FootballPlayer("Lionel Messi", "Argentina", "Inter Miami", "Forward", 5000d, 11),
					new FootballPlayer("Cristiano Ronaldo", "Portugal", "Al Nassr", "Forward", 10000d, 7),
					new FootballPlayer("Erling Haaland", "Norway", "Manchester City", "Striker", 6000d, 1),
					new FootballPlayer("Luka Modric", "Croatia", "Real Madrid", "Midfielder", 7000d, 5),
					new FootballPlayer("Virgil van Dijk", "Netherlands", "Liverpool", "Defender", 2000d, 4),
					new FootballPlayer("Harry Kane", "England", "Bayern Munich", "Striker", 1000d, 9),
					new FootballPlayer("Neymar Jr", "Brazil", "Santos", "Forward", 7000d, 10),
					new FootballPlayer("Mohamed Salah", "Egypt", "Liverpool", "Forward", 9000d, 11),
					new FootballPlayer("Pedri", "Spain", "Barcelona", "Midfielder", 2400d, 2),
					new FootballPlayer("Pedri a", "Italy", "Barcelona", "Goalkeeper", 2800d, 22)
					);
			footballPlayerRepository.saveAll(list);
			System.err.println("Save All payer in data base");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		*/
		/*
		try {
			System.out.println("findByClub");
			footballPlayerRepository.findByClub("Liverpool").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
		/*
		try {
			System.out.println("findPlayersWithSalaryGreaterThan");
			footballPlayerRepository.findPlayersWithSalaryGreaterThan(4500d).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("findByPositionAndCountry");
			footballPlayerRepository.findByPositionAndCountry("Forward", "Portugal").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("findByNameStartsWith");
			footballPlayerRepository.findByNameStartsWith("m").forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("findByJerseyNumberBetween");
			footballPlayerRepository.findByJerseyNumberBetween(1, 7).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		/*
		try {
			System.out.println("countPlayersByCountry");
			System.out.println("count "+footballPlayerRepository.countPlayersByCountry("England"));
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("findHighestPaidPlayers");
			footballPlayerRepository.findHighestPaidPlayers().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("updateSalary");
			footballPlayerRepository.updateSalary(101, 12300d);
			System.err.println("Update successfully..");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("deleteByClub");
			footballPlayerRepository.deleteByClub("Barcelona");
			System.err.println("delete by club ");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		*/
		
		try {
			System.out.println("getPlayerNameAndClub");
			List<Object[]> obj= footballPlayerRepository.getPlayerNameAndClub();
			for(Object[] o : obj) {
				System.out.println("Player name -> "+o[0]);
				System.out.println("club name -> "+o[1]);
				System.out.println("------------");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
