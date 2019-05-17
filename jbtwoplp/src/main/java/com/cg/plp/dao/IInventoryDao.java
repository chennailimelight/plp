package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Inventory;

public interface IInventoryDao extends JpaRepository<Inventory , Integer> {
	
}
