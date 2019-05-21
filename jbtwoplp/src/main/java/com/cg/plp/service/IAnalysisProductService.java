package com.cg.BusinessAnalysis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cg.BusinessAnalysis.model.Product;


public interface IAnalysisProductService {
	
	public List<Product> findProductById(int productid);

	public List<Product> findByMerchantId(int merchantid);

	public List<Product> findBycategory(String category);

}
