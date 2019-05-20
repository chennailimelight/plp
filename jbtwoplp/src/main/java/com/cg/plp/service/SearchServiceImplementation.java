package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cg.plp.dao.SearchDaoInterface;
import com.cg.plp.model.CustomerEntity;
import com.cg.plp.model.MerchantEntity;
import com.cg.plp.model.ProductEntity;

public class SearchServiceImplementation implements SearchServiceInterface {

	@Autowired
	SearchDaoInterface dao;

	@Override
	public List<CustomerEntity> findCustomerByName(String Name) {
		return dao.findCustomerByName(Name);
	}

	@Override
	public List<MerchantEntity> findMerchantByName(String merchantName) {
		return dao.findMerchantByName(merchantName);
	}

	@Override
	public List<ProductEntity> findProducts(String userData) {
		return dao.findProducts(userData);
	}

	@Override
	public List<ProductEntity> findAllProducts(String merchantId) {
		return dao.findAllProducts(merchantId);
	}

}
