package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Customer;
import com.cg.plp.model.Inventory;
import com.cg.plp.model.Merchant;

public interface IAdminService {

	public String generateCoupon();

	public List<Customer> viewCustomer();

	public List<Merchant> viewMerchant();

	public List<Inventory> viewInventory();

	public void sendEmail(String receiverEmail, String subject, String message);

	public void sendCoupon(String receiverEmail);
	

	public void sendFeedback(Feedback feedback);

}
