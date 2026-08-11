package com.nit.runner;

import java.util.List;
import java.util.Set;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.RecipeBook;
import com.nit.service.IRecipeBookService;
@Component
public class RecipeBookRunner implements CommandLineRunner {

	private IRecipeBookService bookService;
	
	public RecipeBookRunner(IRecipeBookService bookService) {
		super();
		this.bookService = bookService;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		/*
		try {
			List<RecipeBook> list = List.of(
					new RecipeBook("Paneer Butter Masala", "North Indian", List.of("Paneer", "Butter", "Tomato", "Cream"), Set.of("Low flame", "Use fresh cream")),
					new RecipeBook(
					        "Veg Biryani",
					        "Indian",
					        List.of("Rice", "Carrot", "Beans", "Peas", "Spices"),
					        Set.of("Cook on dum", "Soak rice")
					    ),
					new RecipeBook(
					        "Masala Dosa",
					        "South Indian",
					        List.of("Rice", "Urad Dal", "Potato", "Onion"),
					        Set.of("Ferment batter", "Use hot tawa")
					    ),
					 new RecipeBook(
						        "Chole Bhature",
						        "Punjabi",
						        List.of("Chickpeas", "Onion", "Tomato", "Spices"),
						        Set.of("Soak overnight", "Pressure cook")
						    ),

						    new RecipeBook(
						        "Hakka Noodles",
						        "Chinese",
						        List.of("Noodles", "Cabbage", "Carrot", "Soy Sauce"),
						        Set.of("Cook on high flame", "Do not overcook noodles")
						    ),
						    new RecipeBook(
						            "Pasta Alfredo",
						            "Italian",
						            List.of("Pasta", "Butter", "Cream", "Cheese"),
						            Set.of("Stir continuously", "Use fresh cheese")
						        ),

						        new RecipeBook(
						            "Margherita Pizza",
						            "Italian",
						            List.of("Pizza Base", "Cheese", "Tomato Sauce", "Basil"),
						            Set.of("Preheat oven", "Bake until crispy")
						        ),

						        new RecipeBook(
						            "Vegetable Fried Rice",
						            "Chinese",
						            List.of("Rice", "Carrot", "Capsicum", "Soy Sauce"),
						            Set.of("Use cold rice", "Cook on high flame")
						        ),

						        new RecipeBook(
						            "Palak Paneer",
						            "North Indian",
						            List.of("Spinach", "Paneer", "Garlic", "Cream"),
						            Set.of("Blanch spinach", "Do not overcook")
						        ),

						        new RecipeBook(
						            "Mango Smoothie",
						            "Beverage",
						            List.of("Mango", "Milk", "Sugar", "Ice Cubes"),
						            Set.of("Use chilled milk", "Blend well")
						        )
					);
			bookService.addRecipe(list);
			System.out.println("save successfuly..");
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		
		/*
		 * try { System.out.println("Show all");
		 * bookService.viewAllRecipe().forEach(System.out::println); } catch (Exception
		 * e) { e.printStackTrace(); // TODO: handle exception }
		 */
		
		/*
		try {
			System.out.println("Find by ID");
			System.out.println(bookService.findbyId(2l));
		} catch (Exception e) {
			// TODO: handle exception
		}
		*/
		/*
		 * try { System.out.println(" Update ingredients");
		 * if(bookService.checkExiste(2l)) { RecipeBook book = new RecipeBook();
		 * book.setRecipeId(2l); book.setIngredients(List.of("Paneer", "Butter",
		 * "Tomato", "Cream", "Cashew"));
		 * 
		 * bookService.update(book); }else { System.out.println(" no id fund"); } }
		 * catch (Exception e) { e.printStackTrace(); // TODO: handle exception }
		 */
		
		try {
			System.out.println("Delete by id");
			if(bookService.checkExiste(10l)) {
				bookService.deleteById(10l);
				System.out.println("Delete successfull");
			}else {
				System.out.println("id not found");
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
