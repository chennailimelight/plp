package com.cg.plp.service;

import com.cg.plp.model.Cart;

public interface ICartService {
	public Cart findById(Integer productId);
	public void delete(Cart cart);
	public void save(Cart cart);

}
