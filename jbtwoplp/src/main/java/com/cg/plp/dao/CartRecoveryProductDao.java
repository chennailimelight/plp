package com.cg.plp.dao;


	import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Product;

	public interface CartRecoveryProductDao  extends JpaRepository<Product, Integer>{

	}
