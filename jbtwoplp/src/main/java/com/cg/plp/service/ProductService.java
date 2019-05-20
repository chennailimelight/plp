package com.cg.product.Service;

import java.util.List;

import com.cg.product.Product;

public interface ProductService {
	public List<Product> findAll();

	public void save(Product product);


	public Product findById(Integer Product_id);
	
	public Product editExistingProductDetails(Product product);
	
	public List<Product> find(Integer Product_Id);
	
	public List<Product> Category();
}
