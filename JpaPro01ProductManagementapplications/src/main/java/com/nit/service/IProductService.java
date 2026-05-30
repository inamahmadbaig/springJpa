package com.nit.service;

import java.util.Optional;

import com.nit.entity.Product;

public interface IProductService {

	public void insertProduct(Product product);
	public Iterable<Product> getAllProduct();
	public Optional<Product> findProductById(Long id);
	public void deleteProductById(Long id);
}
