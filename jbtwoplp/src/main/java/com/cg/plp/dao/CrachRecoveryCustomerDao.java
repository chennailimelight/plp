package com.cg.plp.dao;


	import org.springframework.data.jpa.repository.JpaRepository;

	import com.cg.plp.model.Customer;

	public interface CrachRecoveryCustomerDao extends JpaRepository<Customer, Integer> {
		
		
	}
