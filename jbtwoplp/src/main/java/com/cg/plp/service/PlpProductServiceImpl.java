package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IPlpProductDao;
import com.cg.plp.model.PlpProduct;

@Service("plpproductService")
public class PlpProductServiceImpl implements IPlpProductService {

	@Autowired
	private IPlpProductDao plpproductDao;

	@Override
	public List<PlpProduct> findAll() {
		List<PlpProduct> plpproductlist = plpproductDao.findAll();
		return plpproductlist;

	}

	@Override
	public void save(PlpProduct plpproduct) {
		plpproductDao.save(plpproduct);

	}

	@Override
	public void delete(Integer productId) {
		plpproductDao.deleteById(productId);

	}

	public PlpProduct findById(Integer productId) {
		PlpProduct plpproduct = plpproductDao.findById(productId).get();
		return plpproduct;
		
		
	}
}

