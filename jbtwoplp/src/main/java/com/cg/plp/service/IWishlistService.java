package com.cg.plp.service;

import java.util.List;

import com.cg.plp.model.Wishlist;

public interface IWishlistService {

	public Wishlist findById(Integer productId);

	public List<Wishlist> findAll();

	public void save(Wishlist wishlist);

	public void delete(Wishlist wishlist);
}
