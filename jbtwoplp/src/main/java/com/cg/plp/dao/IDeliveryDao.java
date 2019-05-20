package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Delivery;



public interface IDeliveryDao extends JpaRepository<Delivery, Integer>{
			
	public Delivery findByProductID(int id);
	
	
}
