package com.cg.BusinessAnalysis.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import com.cg.BusinessAnalysis.model.Product;

@Service("dao")
public interface IAnalysisProductDao extends JpaRepository<Product, Integer>{
	
	@Query("SELECT product from Product product WHERE product.productid=?1")
	public List<Product> findProductById(int productid);

	@Query("SELECT product from Product product WHERE product.merchantid=?1")
	public List<Product> findByMerchantId(int merchantid);

	public List<Product> findBycategory(String category);

}
