package com.nit.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
//@Table(name = "Product_info")
public class Product {

	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private long productId;
	
	private String productName;
	
	private String description;
//	@Column(name = "price")
	private double price;
	
}
