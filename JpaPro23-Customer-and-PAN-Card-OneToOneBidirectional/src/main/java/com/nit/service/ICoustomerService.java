package com.nit.service;

import java.util.List;

import com.nit.entity.Customer;

import jakarta.validation.Valid;

public interface ICoustomerService {

	public List<Customer> saveDataCoustomer(@Valid List<Customer> customers);
	public List<Customer> viewaLLdata();
	public void deleteCoustomer(Long id);
}
