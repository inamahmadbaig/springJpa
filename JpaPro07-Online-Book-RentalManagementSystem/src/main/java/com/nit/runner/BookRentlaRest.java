package com.nit.runner;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.RentalBook;
import com.nit.service.IRentalBookService;
import com.nit.service.RentalBookService;
import org.slf4j.*;

@Component
public class BookRentlaRest implements CommandLineRunner {


	@Autowired
	private IRentalBookService bookService;
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(IRentalBookService.class);
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				
				System.out.println("\nOnline Book Rental Management System");
				System.out.println("""
						1. Add a new rental book using save().
						2. Add multiple rental books using saveAll().
						3. Display all books using findAll().
						4. Search a book by ID using findById().
						5. Check whether a book exists using existsById().
						6. Count total books using count().
						7. Update rental price of a book using save().
						8. Delete a book using deleteById().
						9. Delete all books using deleteAll().
						10.Exit 
						\n 
						choice option\n
						
						""");
				int choice = Integer.parseInt(sc.nextLine());
				switch(choice) {
				case 1 ->{
					System.out.println("\nAdd a new rental book using save()");
					System.out.print("Enter Book bookTitle :: ");
					String title = sc.nextLine();
					
					System.out.print("Enter Book authorName :: ");
					String authorName = sc.nextLine();
					
					System.out.print("Enter Book category :: ");
					String category = sc.nextLine();
					
					System.out.print("Enter Book rentalPrice:: ");
					double rentalPrice= Double.parseDouble(sc.nextLine());
					
					RentalBook insertBook = new RentalBook();
					insertBook.setBookTitle(title);
					insertBook.setAuthorName(authorName);
					insertBook.setCategory(category);
					insertBook.setRentalPrice(rentalPrice);
					
					bookService.saveBook(insertBook);
					logger.info("Book insert successfull..");
					
				}
				case 2 ->{
					System.out.println("Add multiple rental books using saveAll().\n");
					List<RentalBook> list = new ArrayList<>();
					System.out.print("How many book do you rental -> ");
					int numberOfBook = Integer.parseInt(sc.nextLine());
					for(int i=1;i<=numberOfBook;i++) {
						System.out.println("Rentel Book  "+i);
						System.out.print("Enter Book bookTitle :: ");
						String title = sc.nextLine();
						
						System.out.print("Enter Book authorName :: ");
						String authorName = sc.nextLine();
						
						System.out.print("Enter Book category :: ");
						String category = sc.nextLine();
						
						System.out.print("Enter Book rentalPrice:: ");
						double rentalPrice= Double.parseDouble(sc.nextLine());
						//create object 
						RentalBook insertBook = new RentalBook();
						insertBook.setBookTitle(title);
						insertBook.setAuthorName(authorName);
						insertBook.setCategory(category);
						insertBook.setRentalPrice(rentalPrice);
						
						//insert data 
						list.add(insertBook);
					}
					//invoke method 
					bookService.saveAllBooks(list);
					logger.info("Insert book ");
					
				}
				case 3 ->{
					System.out.println("Display all books using findAll().\n");
					bookService.getAllBooks().forEach(System.out::println);
					logger.info("display All book");
				}
				case 4 ->{
					System.out.println("Search a book by ID using findById().");
					System.out.print("Enetr Id ");
					long id =  Long.parseLong(sc.nextLine());
					
					//invoke method 
					System.out.println(bookService.getBookById(id));
					logger.info("search successfull..");
				}
				case 5->{
					System.out.println("Check whether a book exists using existsById().");
					System.out.print("Enetr Id ");
					long id =  Long.parseLong(sc.nextLine());
					//invoke method 
					System.out.println(" book -> " +bookService.existsBook(id));
					logger.info("Book Exists : {} ",bookService.existsBook(id));
				}
				case 6 ->{
					System.out.println("Count total books using count().");
					System.out.println("count -> "+bookService.countBooks());
					logger.info("Count Book : {} ",bookService.countBooks());
				}
				case 7 ->{
					System.out.println("Update rental price of a book using save().");
					System.out.print("Enetr Id ");
					long id = Long.parseLong(sc.nextLine());
					
					System.out.print("Enter Book bookTitle :: ");
					String title = sc.nextLine();
					
					System.out.print("Enter Book authorName :: ");
					String authorName = sc.nextLine();
					
					System.out.print("Enter Book category :: ");
					String category = sc.nextLine();
					
					System.out.print("Enter Book rentalPrice:: ");
					double rentalPrice= Double.parseDouble(sc.nextLine());
					
					RentalBook updateBook = new RentalBook();
					updateBook.setBookId(id);
					updateBook.setBookTitle(title);
					updateBook.setAuthorName(authorName);
					updateBook.setCategory(category);
					updateBook.setRentalPrice(rentalPrice);
					
					//invoke methods
					bookService.updateBook(updateBook);
					System.out.println("update successfull");
					logger.info("update successfull...");
				}
				case 8 ->{
					System.out.println("Delete a book using deleteById().");
					System.out.print("Enetr Id ");
					long id = Long.parseLong(sc.nextLine());
					if(bookService.existsBook(id)) {
						bookService.deleteBookById(id);
						System.out.println("deleted");
						logger.info("Delete book Successfull..");
					}else {
						throw new RuntimeException("Book not found with id: " + id);
					}
					//invoke method 
				}
				case 9 ->{
					System.out.println("Delete all books using deleteAll().\n");
					bookService.deleteAllBooks();
					System.out.println("deleted all book");
					logger.info("all book delete");
				}
				case 10 ->{
					System.out.println("Thank you! Vsit again..");
					System.exit(0);
				}
				default ->{
					System.out.println("invaild choice! please select number 1 to 10 only number..");
				}
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				logger.error("Error occurred", e);
			}
		}
	}

}
