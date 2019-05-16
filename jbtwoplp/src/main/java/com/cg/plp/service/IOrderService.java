package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Order;

public interface IOrderService {

	public void save(Order order);
	
	public List<Order> findAll();
}
