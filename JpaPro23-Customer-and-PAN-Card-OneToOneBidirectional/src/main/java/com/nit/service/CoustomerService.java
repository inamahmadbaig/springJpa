package com.nit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

import com.nit.entity.Customer;
import com.nit.repository.CustomerRepository;
import com.nit.repository.PanCardRepository;

import jakarta.validation.Valid;
@Service
@Validated
public class CoustomerService implements ICoustomerService {

	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private PanCardRepository cardRepository;
	@Override
	public List<Customer> saveDataCoustomer(@Valid List<Customer> customers) {
		// TODO Auto-generated method stub
		customers.forEach(customer->{
			if(customer.getPanCard() != null) {
				customer.getPanCard().setCustomer(customer);
			}
		});
		return customerRepository.saveAll(customers);
	}

	@Override
	public List<Customer> viewaLLdata() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public void deleteCoustomer(Long id) {
		// TODO Auto-generated method stub

		customerRepository.deleteById(id);
	}

}

/*
Customer
|
| setCard(card)
↓
PanCard

PanCard
|
| setCustomer(customer)
↓
Customer

*/
