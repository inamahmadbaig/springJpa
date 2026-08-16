package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.LibraryBook;

import jakarta.validation.Valid;

public interface ILibraryBookService {

	public List<LibraryBook> addBook(@Valid List<LibraryBook> books);
	public Optional<LibraryBook> findbyId(Long id);
	public List<LibraryBook> viewAllBook();
	public void deleteBookById(Long id);
	
}
