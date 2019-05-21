package com.cg.product.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.cg.product.Product;

public interface ProductDao  extends JpaRepository<Product,Integer> {

//	@Query("select prod.MAX(Orig_Price) from Product prod where prod.Product_Id=?1 ")
//	public String MaxPriceSort(int Product_Id);

//	@Query("SELECT u.MAX(Orig_Price) FROM Product u WHERE u.Product_Id = :Id")
//	public Product findUserByUserStatusAndUserName(@Param("Id") Integer Product_Id );

	@Query(value = "SELECT MAX(u.Orig_Price) FROM products u WHERE u.Product_Id = :Product_Id ", nativeQuery = true)
			List<Product> find(  @Param("Product_Id") Integer Product_Id);
	
	@Query(value = "SELECT * FROM products u ORDERBY u.Category ", nativeQuery = true)
	Product Category(
			);
	
	@Query(value = "SELECT p.productid,p.quantity FROM products p WHERE u.Product_Id= :Product_Id and u.Quantity=>1 ",nativeQuery = true)
			List<Product>order(@Param("Product_Id") Integer Product_Id);
	
	@Query(value = "SELECT u FROM products u ORDERBY u.Orig_Price  ", nativeQuery = true)
	List<Product> price(  );
}




 
