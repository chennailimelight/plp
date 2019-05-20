package com.cg.plp.service;

import com.cg.plp.model.CartRecovery;
import com.cg.plp.model.Product;

public interface CartRecoveryService {
	
public Product addItem(int pid,int custid);
	
	public void addwish(int custid);
	
	public void removeItem(int pid,int custid);
	
	public CartRecovery display(int custid);
	   

}
