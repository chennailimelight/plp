package com.cg.BusinessAnalysis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.BusinessAnalysis.dao.IAnalysisProductDao;
import com.cg.BusinessAnalysis.model.Product;

@Service("service")
public class AnalysisProductServiceImpl implements IAnalysisProductService {
	
	@Autowired
	private IAnalysisProductDao dao;

	@Override
	public List<Product> findProductById(int productid) {
		return dao.findProductById(productid);
	}

	@Override
	public List<Product> findByMerchantId(int merchantid) {
		return dao.findByMerchantId(merchantid);
	}

	@Override
	public List<Product> findBycategory(String category) {
		return dao.findBycategory(category);
	}


}
