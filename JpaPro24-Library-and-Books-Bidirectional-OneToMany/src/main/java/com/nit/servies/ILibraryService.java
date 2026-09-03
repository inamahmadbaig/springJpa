package com.nit.servies;

import java.util.List;

import com.nit.entity.Library;

import jakarta.validation.Valid;

public interface ILibraryService {

	public List<Library> saveAllBook(@Valid List<Library> libraries);
	public List<Library> viewAll();
	public void deleteById(Long id);
}
