package com.cg.plp.service;

import com.cg.crachrecovery.model.CrachRecovery;

import java.util.List;

import com.cg.crachrecovery.model.Product;

public interface CrachRecoveryService {
	
public Product addItem(int pid,int custid);
	
	public void addwish(int custid);
	
	public void removeItem(int pid,int custid);
	
	public CrachRecovery display(int custid);
	   

}
