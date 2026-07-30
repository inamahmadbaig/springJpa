package com.nit.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.entity.Booking;
import com.nit.repository.BookingRepository;

@Component
public class CommandLineRunner implements org.springframework.boot.CommandLineRunner {

	@Autowired
	private BookingRepository bookingRepository;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("Hotel Room Booking Management System");
				System.out.println("""
						1. insert Data
						2. Chennai or Suite.
						3. Amount 5000-15000.
						4. Days 2-5.
						5. Confirmed or Hyderabad.
						6. Dates 2026-01-01 to 2026-03-31.
						7. Anita or Cancelled.
						8. Deluxe or Pending.
						9. IDs 101-110.
						10.exit
						\n select option
						""");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1->{
					System.out.println("Data insert hotle");
					List<Booking> list = new ArrayList<>();
					System.out.println("how many data data add you for hotel");
					int numberOfHotel = Integer.parseInt(sc.nextLine());
					for(int i=1;i<=numberOfHotel;i++) {
						System.out.println("Hotle "+i);
						System.out.print("Enter guestName ::");
						String guestName = sc.nextLine();
						
						System.out.print("Enter roomType ::");
						String roomType = sc.nextLine();
						
						System.out.print("Enter city ::");
						String city = sc.nextLine();
						
						System.out.print("Enter bookingAmount ::");
						double price = Double.parseDouble(sc.nextLine());
						
						System.out.print("Enter numberOfDays ::");
						int numberOfDays = Integer.parseInt(sc.nextLine());
						
						System.out.print("Enter bookingDate ::");
						String date = sc.nextLine();
						LocalDate bookingDate = LocalDate.parse(date);
						
						System.out.print("Enter bookingStatus ::");
						String bookingStatus = sc.nextLine();
						
						//create object Booking
						Booking insertData = new Booking();
						insertData.setGuestName(guestName);
						insertData.setRoomType(roomType);
						insertData.setCity(city);
						insertData.setBookingAmount(price);
						insertData.setNumberOfDays(numberOfDays);
						insertData.setBookingDate(bookingDate);
						insertData.setBookingStatus(bookingStatus);
						
						list.add(insertData);
					}
					//invoke method
					bookingRepository.saveAll(list);
					System.out.println("Save successfull");
				}
				case 2->{
					System.out.println("2. Chennai or Suite.");
					System.out.print("Enter City name");
					String city = sc.nextLine();
					System.out.print("Enter Suite name");
					String suite = sc.nextLine();
					
					bookingRepository.findByCityOrRoomType(city, suite).forEach(System.out::println);
				}
				case 3 ->{
					System.out.println("3. Amount 5000-15000.");
					bookingRepository.findByBookingAmountBetween(5000d, 15000d).forEach(System.out::println);
				}
				case 4->{
					System.out.println("4. Days 2-5.");
					bookingRepository.findByNumberOfDaysBetween(2, 5).forEach(System.out::println);
				}
				case 5->{
					System.out.println("5. Confirmed or Hyderabad.");
					bookingRepository.findByBookingStatusOrCity("Confirmed", "Hyderabad").forEach(System.out::println);
				}
				case 6->{
					System.out.println("6. Dates 2026-01-01 to 2026-03-31.");
					bookingRepository.findByBookingDateBetween(LocalDate.parse("2026-01-01"), LocalDate.parse("2026, 3, 31")).forEach(System.out::println);
				}
				case 7->{
					System.out.println("7. Anita or Cancelled.");
					bookingRepository.findByRoomTypeOrBookingStatus("Anita", "Cancelled").forEach(System.out::println);
				}
				case 8->{
					System.out.println("8. Deluxe or Pending.");
					bookingRepository.findByRoomTypeOrBookingStatus("Deluxe", "Pending").forEach(System.out::println);
				}
				case 9->{
					System.out.println("9. IDs 101-110.");
					bookingRepository.findByBookingIdBetween(1l, 5l).forEach(System.out::println);
				}
				case 10->{
					System.out.println("Thank you");
					System.exit(0);
				}
				default->{
					System.out.println("invaild choice 1 to 9 ");
				}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
