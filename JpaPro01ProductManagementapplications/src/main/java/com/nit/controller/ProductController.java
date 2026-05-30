package com.nit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nit.entity.Product;
import com.nit.service.IProductService;

@Controller
public class ProductController {

	@Autowired
	private IProductService iProductService;
	
	public void insertProduct(Product product) {
		iProductService.insertProduct(product);
		System.out.println("Product inserted successfully.");
	}
	
	public void retrieveAllProducts() {
		Iterable<Product> pro = iProductService.getAllProduct();
		
		System.out.println("\n--- Product List ---");
		for(Product p : pro) {
			System.out.println(p);
		}
	}
	public void findProductById(Long id) {
		Optional<Product> pro = iProductService.findProductById(id);
		if(pro.isPresent()) {
			System.out.println(pro.get());
		}else {
			System.out.println("Product not found.");
		}
	}
	public void deleteProductById(Long id) {
		Optional<Product> pro = iProductService.findProductById(id);
		
		if(pro.isPresent()) {
			iProductService.deleteProductById(id);
			System.out.println("Product deleted successfully.");
		}else {
			 System.out.println("Product not found.");
		}
		
	}
	
	
}
