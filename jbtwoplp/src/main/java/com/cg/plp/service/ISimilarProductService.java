package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Product;



public interface ISimilarProductService {
	public List<Product> findProductsByCategory(String Category);
}
