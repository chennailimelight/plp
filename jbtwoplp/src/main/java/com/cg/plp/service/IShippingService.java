package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Shipping;

public interface IShippingService {

public Shipping findById(int id);
	
	public Shipping findByIdAndEmail(int id, String email);
	
	public void save(Shipping shipping);
	
	public List<Shipping> findAll();
}
