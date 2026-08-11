package com.nit.entity;

import java.util.List;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
@Entity
@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class RecipeBook {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long recipeId;
	@NonNull
	private String recipeName;
	@NonNull
	private String cuisine;
	@NonNull
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "recipe_ingredients",
	joinColumns = @JoinColumn(name = "recipe_id")
	)
	private	List<String> ingredients ;
	@NonNull
	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "recipe_cooking_tips",
	joinColumns = @JoinColumn(name = "recipe_id")
	)
	private Set<String> cookingTips;
}
