package com.nit.runner;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.controller.ProductController;
import com.nit.entity.Product;
@Component
public class ConsoleApplicationRunner implements CommandLineRunner {

	@Autowired
	private ProductController controller;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			 System.out.println("\n===== PRODUCT MANAGEMENT =====");
	            System.out.println("1. Insert Product");
	            System.out.println("2. View All Products");
	            System.out.println("3. Find Product By ID");
	            System.out.println("4. Delete Product By ID");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");
	            
	            int choice = Integer.parseInt(sc.nextLine());
	            
	            switch(choice) {
	            case 1 ->{
	            	System.out.println("Enter Product ID: ");
	            	Long id = Long.parseLong(sc.nextLine());
	            	
	            	 System.out.print("Enter Product Name: ");
	            	 String name = sc.nextLine();
	            	 
	            	 System.out.print("Enter Description: ");
	            	 String description = sc.nextLine();
	            	 
	            	 System.out.print("Enter Price: ");
	            	 Double price = Double.parseDouble(sc.nextLine());
	            	 
	            	 Product insertProduct = new Product();
	            	 insertProduct.setProductId(id);
	            	 insertProduct.setProductName(name);
	            	 insertProduct.setDescription(description);
	            	 insertProduct.setPrice(price);
	            	 
	            	 controller.insertProduct(insertProduct);
	            }
	            case 2->{
	            	controller.retrieveAllProducts();
	            }
	            case 3->{
	            	System.out.print("Enter Product ID: ");
	            	Long searchId = Long.parseLong(sc.nextLine());
	            	
	            	controller.findProductById(searchId);
	            }
	            case 4->{
	            	System.out.print("Enter Product ID: ");
	            	Long deleteId = Long.parseLong(sc.nextLine());
	            	
	            	controller.deleteProductById(deleteId);
	            }
	            case 5->{
	            	System.out.println("Application Closed.");
                    sc.close();
                    System.exit(0);

	            }
	            default->{
	            	System.out.println("Invalid Choice!");
	            }
	            }
		}
	}

}
