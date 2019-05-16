package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Order;


public interface IOrder  extends JpaRepository<Order, Integer>{

}
