package com.nit.runner;


import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Books;
import com.nit.entity.Library;
import com.nit.servies.ILibraryService;
@Component
public class LibraryManagmentSystemRunner implements CommandLineRunner {

	private ILibraryService iLibraryService;
	
	public LibraryManagmentSystemRunner(ILibraryService iLibraryService) {
		super();
		this.iLibraryService = iLibraryService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		
		try {
			System.out.println("Book data insert");
			Books b1 = new Books("Java", "James", 650d);
			Books b2 = new Books("Spring Book", "Rod Johnson", 850d);
			Books b3 = new Books("Python", "Guido", 550d);
			Books b4 = new Books("Hibernate", "Gavin King", 450d);
			

			List<Library> list = List.of(
					new Library("City Library", "Seoni", List.of(b1,b2,b3,b4))
					);
			iLibraryService.saveAllBook(list);
			System.out.println("save books");
			
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("view data ");
			iLibraryService.viewAll().forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("delete by id");
				iLibraryService.deleteById(4l);
				
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}

}
