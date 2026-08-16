package com.nit.service;

import java.util.List;
import java.util.Optional;
import org.springframework.validation.annotation.Validated;

import org.springframework.stereotype.Service;

import com.nit.entity.LibraryBook;
import com.nit.repositer.LibraryBookRepository;

import jakarta.validation.Valid;

@Service
@Validated
public class LibraryBookService implements ILibraryBookService {

	private LibraryBookRepository bookRepository;
	
	public LibraryBookService(LibraryBookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<LibraryBook> addBook(@Valid List<LibraryBook> books) {
		// TODO Auto-generated method stub
		return bookRepository.saveAll(books);
	}

	@Override
	public Optional<LibraryBook> findbyId(Long id) {
		// TODO Auto-generated method stub
		
		return bookRepository.findById(id);
	}

	@Override
	public List<LibraryBook> viewAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void deleteBookById(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

}
