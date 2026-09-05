package com.nit.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "Product_Inventory")
@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class Product {

	@Id
	@SequenceGenerator(name = "gan1",sequenceName = "productId",initialValue = 100,allocationSize = 1)
	@GeneratedValue(generator = "gan1",strategy = GenerationType.SEQUENCE)
	private Long productId;
	@NonNull
	private String productName;
	@NonNull
	private Double price;
	@NonNull
	private Integer quantity;
	@Version
	private Integer version;
	
	
}
