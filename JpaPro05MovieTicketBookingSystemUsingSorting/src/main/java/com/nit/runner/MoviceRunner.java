package com.nit.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Movie;
import com.nit.service.IMovieService;
@Component
public class MoviceRunner implements CommandLineRunner {

	@Autowired
	private IMovieService iMovieService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		try {
			while(true) {
				System.out.println("Movie Ticket Booking System Using Sorting");
				System.out.println(" 1. Insert Movie ");
				System.out.println(" 2. Movie Name Ascending");
				System.out.println(" 3. Movie Name Descending");
				System.out.println(" 4. Ticket Price Ascending");
				System.out.println(" 5. Ticket Price Descending");
				System.out.println(" 6. Exit Application");
				System.out.println("\n\n choice Option");
				int choice = Integer.parseInt(sc.nextLine());
				
				switch(choice) {
				case 1->{
					List<Movie>  list = new ArrayList<>();
					System.out.println("how many movie insert?");
					int numberOfMovie = Integer.parseInt(sc.nextLine());
					for(int i=1;i<=numberOfMovie;i++) {
						
						System.out.println("Movie "+i);
						System.out.println("Enter movieName");
						String movieName =sc.nextLine();
						
						System.out.println("Enter language");
						String language =sc.nextLine();
						
						System.out.println("Enter ticketPrice");
						double ticketPrice = Double.parseDouble(sc.nextLine());
						
						Movie insertMovie = new Movie();
						insertMovie.setMovieName(movieName);
						insertMovie.setLanguage(language);
						insertMovie.setTicketPrice(ticketPrice);
						
						list.add(insertMovie);
					}
					iMovieService.insertMovice(list);
					System.out.println("Data Insert Successfull");			
				}
				case 2->{
					System.out.println("Movie Name Sorted by Ascending");
					iMovieService.sortByMovieName("asc").forEach(System.out::println);
				}
				case 3->{
					System.out.println("Movie Name Sorted by Descending");
					iMovieService.sortByMovieName("desc").forEach(System.out::println);
				}
				case 4->{
					System.out.println("Sort movies by ticket price Ascending");
					iMovieService.sortMoviesByTicketPrice("asc").forEach(System.out::println);
				}
				case 5->{
					System.out.println("Sort movies by ticket price Descending");
					iMovieService.sortMoviesByTicketPrice("desc").forEach(System.out::println);
				}
				case 6->{
					System.out.println("Thank for using Application");
					System.exit(0);
				}
				default->{
					System.out.println("Invaild option please choice right option");
				}
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
