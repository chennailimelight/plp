package com.cg.product.service;

import java.util.List;

import com.cg.product.Dao.IProduct;
import com.cg.product.model.SimilarProduct;


public class ISimilarProductServiceImpl implements ISimilarProductService {

	private IProduct Dao;
	@Override
	public List<Product> findProductsByCategory(String Category) {
		
		return Dao.getSimilarProducts(Category);
	}
	
	}

