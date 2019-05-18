package com.cg.plp.service;

import com.cg.plp.model.Delivery;

public interface IDeliveryService {
   
	public void save(Delivery delivery);
	public Delivery findById(int id);
	public Delivery findByProductID(int id);
}
