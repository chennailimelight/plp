package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Customer;
import com.cg.plp.model.Merchant;

public interface IAdminService {
	
public void generateCoupon();
public List<Customer> viewCustomer();
public List<Merchant> viewMerchant();
public List<Inventory> viewInventory();
public void sendCoupon(String receiverEmail);

}
