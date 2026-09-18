package com.nit.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.BookS;
import com.nit.repository.BookRepository;
import jakarta.validation.Valid;
@Service
@Validated
public class BookService implements IBookService {

	@Autowired
	private BookRepository bookRepository;
	@Override
	public List<BookS> insertBookData(@Valid List<BookS> bookSs) {
		// TODO Auto-generated method stub
		return bookRepository.saveAll(bookSs);
	}

	@Override
	public List<BookS> viewAllBook() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

}
