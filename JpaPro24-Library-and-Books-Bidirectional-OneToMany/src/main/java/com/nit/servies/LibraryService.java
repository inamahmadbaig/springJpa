package com.nit.servies;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Library;
import com.nit.repositery.LibraryRepository;

import jakarta.validation.Valid;
@Service
@Validated
public class LibraryService implements ILibraryService {

	private LibraryRepository libraryRepository;
	
	public LibraryService(LibraryRepository libraryRepository) {
		super();
		this.libraryRepository = libraryRepository;
	}

	@Override
	public List<Library> saveAllBook(@Valid List<Library> libraries) {
		// TODO Auto-generated method stub
		return libraryRepository.saveAll(libraries);
	}

	@Override
	public List<Library> viewAll() {
		// TODO Auto-generated method stub
		return libraryRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
			libraryRepository.deleteById(id);
		
	}

}
