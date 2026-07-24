package com.nit.service;

import java.util.List;
import java.util.Optional;
import org.springframework.validation.annotation.Validated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.RentalBook;
import com.nit.repositiory.RentalBookRepository;

import jakarta.validation.Valid;

@Service
@Validated

public class RentalBookService implements IRentalBookService {

	@Autowired
	private RentalBookRepository bookRepository;
	@Override
	public void saveBook(RentalBook book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public List<RentalBook> saveAllBooks(@Valid List<RentalBook> books) {
		// TODO Auto-generated method stub
		return bookRepository.saveAll(books);
	}

	@Override
	public RentalBook getBookById(Long id) {
	    return bookRepository.findById(id)
	            .orElseThrow(() -> new RuntimeException("Book not found with id: " + id));
	}

	@Override
	public Iterable<RentalBook> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public RentalBook updateBook(RentalBook book) {
		RentalBook existingBook = bookRepository.findById(book.getBookId())
	            .orElseThrow(() -> new RuntimeException("Book not found"));
		existingBook.setBookTitle(book.getBookTitle());
		existingBook.setAuthorName(book.getAuthorName());
		existingBook.setCategory(book.getCategory());
		existingBook.setRentalPrice(book.getRentalPrice());
		
		return bookRepository.save(existingBook);
	}

	@Override
	public void deleteBookById(Long id) {
		bookRepository.deleteById(id);

	}

	@Override
	public void deleteAllBooks() {
		bookRepository.deleteAll();

	}

	@Override
	public long countBooks() {
		// TODO Auto-generated method stub
		return bookRepository.count();
	}

	@Override
	public boolean existsBook(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.existsById(id);
	}

}
