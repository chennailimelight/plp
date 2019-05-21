package com.cg.plp.service;

import java.util.List;

import com.cg.model.TpMerchant;



public interface ITpMerchantService {
	
	public List<TpMerchant> findAll();

	public void save(TpMerchant tpmerchant);

	public void delete(Integer tpmerchantId);
	
	public TpMerchant findById(Integer tpmerchantId);
	
}
	