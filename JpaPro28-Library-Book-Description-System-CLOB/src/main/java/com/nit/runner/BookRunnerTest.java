package com.nit.runner;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.BookS;
import com.nit.service.IBookService;
@Component
public class BookRunnerTest implements CommandLineRunner {

	@Autowired
	private IBookService service;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		try {
			List<BookS> listBook = List.of(
					new BookS("java", "james", Files.readString(Path.of("C:\\bol\\inam.txt"))),
					new BookS("HTML", "Mariyum", Files.readString(Path.of("C:\\bol\\xxx.txt")))
					);
			service.insertBookData(listBook);
			System.out.println("sava file ");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		try {
			System.out.println("view all data");
			service.viewAllBook().forEach(System.out::println);
		} catch (Exception e) {
			e.getMessage();
			// TODO: handle exception
		}
	}

}
