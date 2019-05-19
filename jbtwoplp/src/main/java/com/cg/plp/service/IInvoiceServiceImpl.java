package com.cg.plp.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IInvoiceDao;
import com.cg.plp.model.Invoice;
@Service("service")

public class IInvoiceServiceImpl implements IInvoiceService {
	@PersistenceContext
	private EntityManager em;

	@Autowired
	private  IInvoiceDao  dao;

	
	@Override
	public Invoice findById(Integer productId) {
		return null;
	}

	@Override
	public void delete(Invoice cart) {
		// TODO Auto-generated method stub

	}

	@Override
	public void save(Invoice cart) {
    dao.save(cart);		
	}
	

}
