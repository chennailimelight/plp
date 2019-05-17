package com.cg.plp.service;

import java.util.List;

import com.cg.plp.dao.IProduct;
import com.cg.plp.model.Product;


public class ISimilarProductServiceImpl implements ISimilarProductService {

	private IProduct Dao;
	@Override
	public List<Product> findProductsByCategory(String Category) {
		
		return Dao.getSimilarProducts(Category);
	}
	
	}

