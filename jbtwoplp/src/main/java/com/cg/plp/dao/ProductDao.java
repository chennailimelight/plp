package com.cg.product.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.product.Product;

public interface ProductDao  extends JpaRepository<Product,Integer> {
}

 
