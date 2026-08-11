package com.nit.repositer;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.RecipeBook;

public interface RecipeBookRepository extends JpaRepository<RecipeBook, Long> {

}
