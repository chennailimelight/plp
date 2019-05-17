package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Cart;


public interface ICartDao extends JpaRepository<Cart, Integer>{

}
