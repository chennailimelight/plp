package com.cg.plp.service;

import com.cg.plp.model.CrachRecovery;
import com.cg.plp.model.Product;

public interface CartRecoveryService {
	
public Product addItem(int pid,int custid);
	
	public void addwish(int custid);
	
	public void removeItem(int pid,int custid);
	
	public CrachRecovery display(int custid);
	   

}
