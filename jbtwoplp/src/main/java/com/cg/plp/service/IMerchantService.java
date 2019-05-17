package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Merchant;

public interface IMerchantService {
	
	public List<Merchant> findAll();

	public void save(Merchant merchant);

	public void delete(Integer merchantId);
	
	public Merchant findById(Integer merchantId);
	
	

}
