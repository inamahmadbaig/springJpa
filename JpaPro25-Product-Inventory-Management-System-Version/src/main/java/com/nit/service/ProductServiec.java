package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Product;
import com.nit.reopsitory.ProductRepositery;

import jakarta.validation.Valid;

@Service
@Validated
public class ProductServiec implements IProductServiec {

	private ProductRepositery productRepositery;
	
	public ProductServiec(ProductRepositery productRepositery) {
		super();
		this.productRepositery = productRepositery;
	}

	@Override
	public List<Product> addProduct(@Valid List<Product> products) {
		
		return productRepositery.saveAll(products);
	}

	@Override
	public Optional<Product> productFindById(Long id) {
		return productRepositery.findById(id);
	}

	@Override
	public Product updataProductDetails(Product product) {

		Product product2 = productRepositery.findById(product.getProductId()).orElseThrow(() -> new RuntimeException("Product not found"));
//		product2.setProductName(product.getProductName());
//		product2.setPrice(product.getPrice());
		product2.setQuantity(product.getQuantity());
		return productRepositery.save(product2);
	}

	@Override
	public List<Product> viewAllProduct() {
		return productRepositery.findAll();
	}

}
