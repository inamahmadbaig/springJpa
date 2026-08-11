package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nit.entity.RecipeBook;
import com.nit.repositer.RecipeBookRepository;
@Service
public class RecipeBookService implements IRecipeBookService {

	private RecipeBookRepository bookRepository;
	
	public RecipeBookService(RecipeBookRepository bookRepository) {
		super();
		this.bookRepository = bookRepository;
	}

	@Override
	public List<RecipeBook> addRecipe(List<RecipeBook> books) {
		// TODO Auto-generated method stub
		return bookRepository.saveAll(books);
	}

	@Override
	public List<RecipeBook> viewAllRecipe() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Optional<RecipeBook> findbyId(Long id) {
		// TODO Auto-generated method stub
		
		return bookRepository.findById(id);
	}

	@Override
	public RecipeBook update(RecipeBook book) {
		// TODO Auto-generated method stub
		RecipeBook book2 = bookRepository.findById(book.getRecipeId()).orElseThrow(()->  new RuntimeException("id not fund "+book.getRecipeId()));
//		book2.setRecipeName(book.getRecipeName());
		//book2.setCuisine(book.getCuisine());
		book2.setIngredients(book.getIngredients());
		//book2.setCookingTips(book.getCookingTips());
		
		
		return bookRepository.save(book2);
	}

	@Override
	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

	@Override
	public boolean checkExiste(Long id) {
		// TODO Auto-generated method stub
		return bookRepository.existsById(id);
	}

}
