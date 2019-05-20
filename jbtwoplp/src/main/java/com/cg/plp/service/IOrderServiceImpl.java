package com.cg.plp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IOrder;
import com.cg.plp.model.Order;

@Service("service3")
public class IOrderServiceImpl implements IOrderService {

	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	IOrder dao;
	
	@Override
	public void save(Order order) {
       dao.save(order);
	}

	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
