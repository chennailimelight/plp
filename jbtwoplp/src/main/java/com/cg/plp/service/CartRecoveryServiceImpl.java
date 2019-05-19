package com.cg.plp.service;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.plp.dao.CartRecoveryCustomerDao;
import com.cg.plp.dao.CartRecoveryProductDao;
import com.cg.plp.dao.IWishlistDao;
import com.cg.plp.model.CrachRecovery;
import com.cg.plp.model.Customer;
import com.cg.plp.model.Product;

@Component
public class CartRecoveryServiceImpl implements CartRecoveryService {
	@Autowired
	IWishlistDao repo;
	@Autowired
	CartRecoveryProductDao repoprod;
	@Autowired
	CartRecoveryCustomerDao repocust;

	

	@Override
	public Product addItem(int pid, int custid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		CrachRecovery wishlist = repo.getOne(customer.getWishList().getId());
		wishlist.setStartTime(Date.valueOf(LocalDate.now()));
		List<Product> prod = wishlist.getProduct();
		prod.add(product);
		wishlist.setProduct(prod);
		repo.save(wishlist);
		return product;
	}

	@Override
	public void addwish(int custid) {
		Customer customer = repocust.getOne(custid);
		CrachRecovery wishlist = new CrachRecovery();
		wishlist.setStartTime(Date.valueOf(LocalDate.now()));
		repo.save(wishlist);
		customer.setWishList(repo.getOne(wishlist.getId()));
		repocust.save(customer);

	}
    
	@Override
	public void removeItem(int pid, int custid) {
		Product product = repoprod.getOne(pid);
		Customer customer = repocust.getOne(custid);
		CrachRecovery wishlist = repo.getOne(customer.getWishList().getId());
		List<Product> prod = wishlist.getProduct();
		prod.remove(product);
		wishlist.setProduct(prod);

		repo.save(wishlist);
	}

	@Override
	public CrachRecovery display(int custid) {
		Customer customer = repocust.getOne(custid);
		return repo.getOne(customer.getWishList().getId());
	}

}

