package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.PlpProduct;



public interface IPlpProductDao extends JpaRepository<PlpProduct,Integer>{

}
