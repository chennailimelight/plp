package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.CustomerEntity;
import com.cg.plp.model.MerchantEntity;
import com.cg.plp.model.ProductEntity;

public interface SearchServiceInterface {
	public List<CustomerEntity> findCustomerByName(String Name);

	public List<MerchantEntity> findMerchantByName(String merchantName);

	public List<ProductEntity> findProducts(String userData);

	public List<ProductEntity> findAllProducts(String merchantId);
}
