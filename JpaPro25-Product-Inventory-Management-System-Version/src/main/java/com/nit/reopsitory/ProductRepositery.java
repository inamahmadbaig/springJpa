package com.nit.reopsitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.entity.Product;

public interface ProductRepositery extends JpaRepository<Product, Long> {

}
