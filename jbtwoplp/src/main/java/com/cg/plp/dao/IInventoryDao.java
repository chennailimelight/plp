package com.cg.Shopping.Cart.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.Shopping.Cart.model.Inventory;

public interface IInventoryDao extends JpaRepository<Inventory , Integer> {
	
}
