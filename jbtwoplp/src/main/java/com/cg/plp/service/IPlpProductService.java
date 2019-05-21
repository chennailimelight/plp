package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.PlpProduct;



public interface IPlpProductService {
	
	public List<PlpProduct> findAll();

	public void save(PlpProduct plpproduct);

	public void delete(Integer productId);
	
	public PlpProduct findById(Integer productId);

}
