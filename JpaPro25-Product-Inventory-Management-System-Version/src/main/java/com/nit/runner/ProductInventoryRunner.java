package com.nit.runner;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Product;
import com.nit.service.IProductServiec;
@Component
public class ProductInventoryRunner implements CommandLineRunner {

	private IProductServiec iProductServiec;
	private static final Logger log = LoggerFactory.getLogger(ProductInventoryRunner.class);
	public ProductInventoryRunner(IProductServiec iProductServiec) {
		super();
		this.iProductServiec = iProductServiec;
	}

	@Override
	public void run(String... args) throws Exception {
		/*
		try {
			log.info("Add product");
			List<Product> productsList = List.of(
					new Product("Laptop", 55000.0, 10),
					new Product("Mouse", 600.0, 50),
					new Product("Keyboard", 900.0, 30),
					new Product("Monitor", 14200.0, 15),
					new Product("Printer", 10000.0, 5)
					);
			iProductServiec.addProduct(productsList);
			log.info("add");
		} catch (Exception e) {
			log.error("Exception ouccurred ",e);
		
		}
		*/
		/*
		try {
			log.info("View data");
			iProductServiec.viewAllProduct().forEach(System.out::println);
		} catch (Exception e) {
			log.error("Exception ouccurred ", e);
			// TODO: handle exception
		}
		*/
		/*
		try {
			System.out.println("find by id");
			log.info("sarch by id");
			System.out.println("Details -> "+iProductServiec.productFindById(103l));
		} catch (Exception e) {
			log.error("Error ",e);
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("Update");
			log.info("update product Quantity");
			//create object and set data
			Product productUpdate = new Product();
			productUpdate.setProductId(103l);
			productUpdate.setQuantity(333);
			//invoke b.method
			iProductServiec.updataProductDetails(productUpdate);
			System.out.println("update successfull");
		} catch (Exception e) {
			log.error("Error ",e);
			// TODO: handle exception
		}
		
	}

}
