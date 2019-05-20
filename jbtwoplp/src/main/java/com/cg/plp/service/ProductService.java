package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Product;

public interface ProductService {
	public List<Product> findAll();

	public void save(Product product);


	public Product findById(Integer Product_id);
	
	public Product editExistingProductDetails(Product product);
}
