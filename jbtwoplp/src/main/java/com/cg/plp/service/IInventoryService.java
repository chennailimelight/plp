package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Inventory;

public interface IInventoryService {

	
	
	public abstract void delete(Inventory inventory);
	
	public Inventory findByProductId(Integer productId);
	
	public List<Inventory> findAllProducts();
	
	public abstract Inventory updateExistingProduct(Inventory inventory);
	
	public Inventory findById(int id);
	
	public void save(Inventory inventory);
	
}
