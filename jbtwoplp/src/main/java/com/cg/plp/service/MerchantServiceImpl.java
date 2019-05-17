package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.MerchantDao;
import com.cg.plp.model.Merchant;

@Service("merchantService")
public class MerchantServiceImpl implements IMerchantService {

	@Autowired
	private MerchantDao merchantDao;

	@Override
	public List<Merchant> findAll() {
		List<Merchant> merchantlist = merchantDao.findAll();
		return merchantlist;

	}

	@Override
	public void save(Merchant merchant) {
		merchantDao.save(merchant);

	}

	@Override
	public void delete(Integer merchantId) {
		merchantDao.deleteById(merchantId);

	}

	public Merchant findById(Integer merchantId) {
		Merchant merchant = merchantDao.findById(merchantId).get();
		return merchant;
	}
}