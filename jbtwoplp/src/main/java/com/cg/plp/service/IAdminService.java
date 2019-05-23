package com.example.capStoreBack.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.cg.plp.model.Feedback;
import com.cg.plp.model.Inventory;
import com.cg.plp.model.Merchant;
import com.cg.plp.model.Customer;

@Service("service")
public interface IAdminService {

	public void save(Customer user);// to save in the database

	public Customer findByEmail(String email);

	public Customer findByEmailAndPassword(String email,String password);
	
	public Merchant findByEmailAndPasswordMerchant(String email,String password);

	public String generateCoupon();

	public List<Customer> viewCustomer();

	public List<Merchant> viewMerchant();

	public List<Inventory> viewInventory();

	public void sendEmail(String receiverEmail, String subject, String message);

	public void sendCoupon(String receiverEmail);

//	public void sendFeedback(Feedback feedback);
	
	public String encryptPassword(String password);
	
	public String decryptPassword(String password);
	

}
