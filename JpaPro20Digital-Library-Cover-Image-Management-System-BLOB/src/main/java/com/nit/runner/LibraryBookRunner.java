package com.nit.runner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.LibraryBook;
import com.nit.service.ILibraryBookService;

@Component
public class LibraryBookRunner implements CommandLineRunner {

	private ILibraryBookService bookService;
	
	public LibraryBookRunner(ILibraryBookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		 * try { List<LibraryBook> list = List.of( new
		 * LibraryBook("Spring Boot in Action", "Robert",
		 * Files.readAllBytes(Path.of("C:\\bol\\women.jpg"))), new
		 * LibraryBook("Spring Boot in Action", "Robert",
		 * Files.readAllBytes(Path.of("C:\\bol\\sweet.jpg"))) //new
		 * LibraryBook(" Vanessa Kirby,", "Actoress",
		 * Files.readAllBytes(Path.of("C:\\bol\\nepo.webp"))) );
		 * bookService.addBook(list); System.out.println("save"); } catch (Exception e)
		 * { e.printStackTrace(); // TODO: handle exception }
		 */
		/*
		try {
			System.out.println("2. Find Book By Id");
			Optional<LibraryBook> opt = bookService.findbyId(52l);
			if(opt.isPresent()) {
				
				System.out.println("id is fund "+opt.get());
			}else {
				System.out.println("id  not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("3. View All Books");
			bookService.viewAllBook().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("4. Delete Book");
			Optional<LibraryBook> opt = bookService.findbyId(53l);
			if(opt.isPresent()) {
				bookService.deleteBookById(53l);
				
				System.out.println("id is delete  ");
			}else {
				System.out.println("id  not found");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
