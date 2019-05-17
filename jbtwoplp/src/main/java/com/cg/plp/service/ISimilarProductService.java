package com.cg.product.service;

import java.util.List;

import com.cg.product.model.SimilarProduct;



public interface ISimilarProductService {
	public List<Product> findProductsByCategory(String Category);
}
