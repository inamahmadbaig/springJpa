package com.nit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nit.entity.Product;
@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

}
