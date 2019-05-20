package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Customer;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

	public Customer findByEmailAndPass(String email, String password);

	public Customer findByEmail(String temp);
	
}
