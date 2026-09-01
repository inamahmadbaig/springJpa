package com.nit.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Customer;
import com.nit.entity.PanCard;
import com.nit.service.ICoustomerService;
@Component
public class CustomerandPANCardRunner implements CommandLineRunner {

	@Autowired
	private ICoustomerService coustomerService;
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/*
		try {
			System.out.println("pancar details add");
			PanCard card1 = new PanCard();
			card1.setPanNumber("ddljp3020d");
			card1.setIssueDate("12/12/2015");
			
			PanCard card2 = new PanCard();
			card2.setPanNumber("XXXjp3020d");
			card2.setIssueDate("12/12/2016");
			
			List<Customer> listCustomer = List.of(
					new Customer("Inam", "xyz@gmail.com", "seoni",card1),
					new Customer("Ahmad", "xxxx@gmail.com", "bhopal",card2)
					);
			coustomerService.saveDataCoustomer(listCustomer);
			System.out.println("save data");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		*/
		
		try {
			System.out.println("view all data ");
			coustomerService.viewaLLdata().forEach(customer->{
				System.out.println("customerId      : "+customer.getCustomerId());
				System.out.println("customerName    : "+customer.getCustomerName());
				System.out.println("email	\t: "+customer.getEmail());
				System.out.println("city	\t: "+customer.getCity());
				
				if(customer.getPanCard() != null) {
					System.out.println("panId    \t:  "+customer.getPanCard().getPanid());
					System.out.println("panNumber \t: "+customer.getPanCard().getPanNumber());
					System.out.println("issueDate \t: "+customer.getPanCard().getIssueDate());
				}
				
				System.out.println("=======================");
//				System.out.println("Pan details");
				
			});
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
		/*
		try {
			System.out.println("delete details with id");
			coustomerService.deleteCoustomer(2l);
			System.out.println("delete data ");
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}*/
	}

}
