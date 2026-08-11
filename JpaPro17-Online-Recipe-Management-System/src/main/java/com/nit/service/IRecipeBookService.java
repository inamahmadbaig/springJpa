package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.RecipeBook;

public interface IRecipeBookService {

	public List<RecipeBook> addRecipe(List<RecipeBook> books);
	public List<RecipeBook> viewAllRecipe();
	public Optional<RecipeBook> findbyId(Long id);
	public RecipeBook update(RecipeBook book);
	public void deleteById(Long id);
	public boolean checkExiste(Long id);
}
