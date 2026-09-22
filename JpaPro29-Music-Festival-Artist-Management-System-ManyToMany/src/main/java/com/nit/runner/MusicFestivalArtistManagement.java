package com.nit.runner;

import com.nit.repository.ArtistRepository;
import com.nit.repository.FestivalRepository;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Artist;
import com.nit.entity.Festival;
import com.nit.service.IArtistService;
import com.nit.service.IFestivalService;

@Component
public class MusicFestivalArtistManagement implements CommandLineRunner {

	
	@Autowired
	private IArtistService artistService;
	@Autowired
	private IFestivalService festivalService;

	private static final Logger log = LoggerFactory.getLogger(MusicFestivalArtistManagement.class);
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*try {
			System.out.println("add festival data");
		
			Festival f1 = new Festival("Sunburn Festival", "Goa", "2026-12-28", 4999.00, new ArrayList<>());
		
			Festival f2 = new Festival("NH7 Weekender", "Pune", "2026-11-15", 2999.00, new ArrayList<>());
		
			Festival f3 = new Festival("Lollapalooza India", "Mumbai", "2026-01-25", 6999.00, new ArrayList<>());
		
			System.out.println("Artist data Insert");
			Artist a1 = new Artist("A. R. Rahman", "Music Composer", "India", 30, new ArrayList<>());
		
			Artist a2 = new Artist("Arijit Singh", "Playback", "India", 20, new ArrayList<>());
		
			Artist a3 = new Artist("Ed Sheeran", "Pop", "United Kingdom", 17, new ArrayList<>());
		
		
			// A. R. Rahman -> Sunburn, NH7
			a1.getFestivals().add(f1);
			a1.getFestivals().add(f2);
			
			f1.getArtists().add(a1);
			f2.getArtists().add(a1);
			
			// Arijit Singh -> Sunburn, Lollapalooza
			a2.getFestivals().add(f1);
			a2.getFestivals().add(f3);
		
			f1.getArtists().add(a2);
			f3.getArtists().add(a2);
		
			// Ed Sheeran -> NH7, Lollapalooza
			a3.getFestivals().add(f2);
			a3.getFestivals().add(f3);
		
			f2.getArtists().add(a3);
			f3.getArtists().add(a3);
			
			artistService.insertData(List.of(a1,a2,a3));
			System.out.println("data save");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		/*try {
			System.out.println("findyByName");
			artistService.findyByName("A. R. Rahman").forEach(artist->{
				System.out.println(" artistId- \t"+artist.getArtistId());
				System.out.println(" artistName- \t"+artist.getArtistName());
				System.out.println(" genre- \t"+artist.getGenre());
				System.out.println(" country- \t"+artist.getCountry());
				System.out.println(" experienceYears-"+artist.getExperienceYears());
				System.out.println("====================================");
				artist.getFestivals().forEach(festival->{
					System.out.println(" festivalId- \t"+festival.getFestivalId());
					System.out.println(" festivalName- \t"+festival.getFestivalName());
					System.out.println(" city- \t\t"+festival.getCity());
					System.out.println(" eventDate- \t"+festival.getEventDate());
					System.out.println(" ticketPrice- \t"+festival.getTicketPrice());
				});
			});
		} catch (Exception e) {
			// TODO: handle exception
		}*/

		/*try {
			System.out.println("findArtistsByFestival");
			artistService.findArtistsByFestival("Lollapalooza India").forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}*/
		/*try {
			//Agar festivals ki details dekhni hain, to manually print karo:
			System.out.println("findby name");
			artistService.findyByName("Arijit Singh").forEach(System.out::println);
		} catch (Exception e) {
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("updateExperienceYears");
			Artist artist = new Artist();
			artist.setArtistId(1l);
			artist.setExperienceYears(35);
			artistService.updateExperienceYears(artist);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("findByFestivalName");
			festivalService.findyByFestivalName("Sunburn Festival").forEach(System.out::println);
		    .forEach(festival -> {
		     *this is manualy aproch
		    	System.out.println(" festivalId- \t"+festival.getFestivalId());
				System.out.println(" festivalName- \t"+festival.getFestivalName());
				System.out.println(" city- \t\t"+festival.getCity());
				System.out.println(" eventDate- \t"+festival.getEventDate());
				System.out.println(" ticketPrice- \t"+festival.getTicketPrice());
		    });
		} catch (Exception e2) {
			e2.printStackTrace();
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("Update Festival ticketPrice");
			Festival festivalUpdatePrice = new Festival();
			festivalUpdatePrice.setFestivalId(2l);
			festivalUpdatePrice.setTicketPrice(5999.0);
			festivalService.updateTicketPrice(festivalUpdatePrice);
			System.out.println("update");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("deleteFestival");
			festivalService.deleteFestival(3l);
			log.info("delete successfull");
		} catch (Exception e2) {
			e2.printStackTrace();
			log.error("error ayaa",e2);
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("Delete an Artist.");
			artistService.deleteArtist(3l);
			log.info("delete");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		/*
		try {
			System.out.println("Display all Artists");
			artistService.viewAllData().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
		
		try {
			System.out.println("Display all Festivals");
			festivalService.viewAllData().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
