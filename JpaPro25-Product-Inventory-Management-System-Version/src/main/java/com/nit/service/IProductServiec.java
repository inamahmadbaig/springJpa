package com.nit.service;

import java.util.List;
import java.util.Optional;

import com.nit.entity.Product;

import jakarta.validation.Valid;

public interface IProductServiec {

	public List<Product> addProduct(@Valid List<Product> products);
	public Optional<Product> productFindById(Long id);
	public Product updataProductDetails(Product product);
	public List<Product> viewAllProduct();
}
