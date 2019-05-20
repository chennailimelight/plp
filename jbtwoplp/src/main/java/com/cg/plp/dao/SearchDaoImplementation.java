package com.cg.plp.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

import com.cg.plp.model.CustomerEntity;
import com.cg.plp.model.MerchantEntity;
import com.cg.plp.model.ProductEntity;

@Configuration
@Repository
public class SearchDaoImplementation implements SearchDaoInterface {

	@PersistenceContext
	EntityManager entityManager;

	@Override
	public List<CustomerEntity> findCustomerByName(String customerName) {
		System.out.println("in dao");
		TypedQuery<CustomerEntity> query = entityManager.createQuery(
				"SELECT customerdetails FROM CustomerEntity customerdetails where customerdetails.name =?1",
				CustomerEntity.class);
		query.setParameter(1, customerName);
		List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
		customerList = query.getResultList();
		return customerList;
	}

	@Override
	public List<MerchantEntity> findMerchantByName(String merchantName) {
		System.out.println(merchantName);
		TypedQuery<MerchantEntity> query = entityManager.createQuery(
				"select merchantdetails from MerchantEntity merchantdetails where merchantdetails.name =?1",
				MerchantEntity.class);
		query.setParameter(1, merchantName);
		List<MerchantEntity> merchantList = new ArrayList<MerchantEntity>();
		merchantList = query.getResultList();
		System.out.println("merchant fetched");
		return merchantList;
	}

	@Override
	public List<ProductEntity> findProducts(String userData) {
		TypedQuery<ProductEntity> query = entityManager.createQuery(
				"select productdetails from  ProductEntity productdetails where productdetails.product_Name =?1 or productdetails.product_Category=?2",
				ProductEntity.class);
		query.setParameter(1, userData);
		query.setParameter(2, userData);
		List<ProductEntity> productList = new ArrayList<ProductEntity>();
		productList = query.getResultList();
		return productList;
	}

	@Override
	public List<ProductEntity> findAllProducts(String merchantId) {
		TypedQuery<ProductEntity> query = entityManager.createQuery(
				"select productdetails from  ProductEntity productdetails where productdetails.merchant_email_Id =?1",
				ProductEntity.class);
		query.setParameter(1, merchantId);
		List<ProductEntity> productsList = new ArrayList<ProductEntity>();
		productsList = query.getResultList();
		return productsList;
	}

}
