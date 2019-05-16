package com.cg.plp.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.CustomerDao;
import com.cg.plp.model.Customer;

@Service("service")
public class CustomerServiceImpl implements ICustomerService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private CustomerDao customerdao;


	

	
	@Override
	public List<Customer> findAll() {
		List<Customer> customerlist = customerdao.findAll();
		return customerlist;
	}

	@Override
	public void save(Customer customer) {
		customerdao.save(customer);

	}

	@Override
	public Customer findById(Integer id) {
		Customer customer = customerdao.findById(id).get();
		return customer;
	}

	@Override
	public Customer findByEmailAndPass(String email, String password) {
		try {
			Customer customer = customerdao.findByEmailAndPass(email, password);
			return customer;
		} catch (Exception e) {
			return null;
		}
	}
	@Override
	public Customer findByEmail(String email) {
		Customer customer = customerdao.findByEmail(email);
		return customer;
	}

	

	

}
