package com.cg.plp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.ICartDao;
import com.cg.plp.model.Cart;

@Service("cartService")
public class CartServiceImpl implements ICartService {
	@Autowired
	private ICartDao cartDao;

	@Override
	public Cart findById(Integer productId) {
		// TODO Auto-generated method stub
		Cart cart=cartDao.findById(productId).get();
		return cart;
	}

	@Override
	public void delete(Cart cart) {
		// TODO Auto-generated method stub
		cartDao.delete(cart);
	}

	@Override
	public void save(Cart cart) {
		// TODO Auto-generated method stub
		cartDao.save(cart);

	}

}
