package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.RentalBook;

import jakarta.validation.Valid;

public interface IRentalBookService {

	public void saveBook(RentalBook book);
	public List<RentalBook> saveAllBooks(@Valid List<RentalBook> books);
	public RentalBook getBookById(Long id);
	public Iterable<RentalBook> getAllBooks();
	public RentalBook updateBook(RentalBook book);
	public void deleteBookById(Long id);
	public void deleteAllBooks();
	public long countBooks();
	public boolean existsBook(Long id);
}
