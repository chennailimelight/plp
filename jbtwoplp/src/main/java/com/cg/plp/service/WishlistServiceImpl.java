package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IWishlistDao;
import com.cg.plp.model.Wishlist;

@Service("wishlistServiceImpl")
public class WishlistServiceImpl implements IWishlistService {

	@Autowired
	private IWishlistDao wishlistDao;

	@Override
	public Wishlist findById(Integer productId) {
		Wishlist wish = wishlistDao.findById(productId).get();
		return wish;
	}

	@Override
	public List<Wishlist> findAll() {
		List<Wishlist> wishlist = wishlistDao.findAll();
		return wishlist;
	}

	@Override
	public void save(Wishlist wishlist) {
		wishlistDao.save(wishlist);
	}

	@Override
	public void delete(Wishlist wishlist) {
		wishlistDao.delete(wishlist);
	}

}
