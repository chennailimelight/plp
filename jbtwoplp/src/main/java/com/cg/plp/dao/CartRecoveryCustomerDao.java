package com.cg.plp.dao;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Customer;

	public interface CartRecoveryCustomerDao extends JpaRepository<Customer, Integer> {
		
		
	}
