package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Customer;

public interface ICustomerService {

	public List<Customer> findAll();

	public void save(Customer customer);

	public Customer findById(Integer id);

	public Customer findByEmailAndPass(String email, String password);

	Customer findByEmail(String email);

	


}
