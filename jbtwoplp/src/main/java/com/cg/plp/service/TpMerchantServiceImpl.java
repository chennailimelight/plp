package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.ITpMerchantDao;
import com.cg.model.TpMerchant;

@Service("merchantService")
public class TpMerchantServiceImpl implements ITpMerchantService {

	@Autowired
	private ITpMerchantDao tpmerchantDao;

	@Override
	public List<TpMerchant> findAll() {
		List<TpMerchant> tpmerchantlist = tpmerchantDao.findAll();
		return tpmerchantlist;

	}

	@Override
	public void save(TpMerchant tpmerchant) {
		tpmerchantDao.save(tpmerchant);

	}

	@Override
	public void delete(Integer tpmerchantId) {
		tpmerchantDao.deleteById(tpmerchantId);

	}

	public TpMerchant findById(Integer tpmerchantId) {
		TpMerchant tpmerchant = tpmerchantDao.findById(tpmerchantId).get();
		return tpmerchant;
		
		
	}
}

	