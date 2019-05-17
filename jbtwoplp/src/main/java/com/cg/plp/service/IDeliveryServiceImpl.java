package com.cg.plp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IDeliveryDao;
import com.cg.plp.model.Delivery;

@Service("service5")
public class IDeliveryServiceImpl implements IDeliveryService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	IDeliveryDao dao;
	
	
	@Override
	public Delivery findById(int id) {
		
		return dao.findById(id).get();
	}

	@Override
	public void save(Delivery delivery) {
		dao.save(delivery);
	}

	@Override
	public Delivery findByProductID(int id) {
		
		return dao.findByProductID(id);
	}
	
	

}
