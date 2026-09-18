package com.nit.service;

import java.util.List;

import com.nit.entity.BookS;

import jakarta.validation.Valid;

public interface IBookService {

	public List<BookS> insertBookData(@Valid List<BookS> bookSs);
	public List<BookS> viewAllBook();
}
