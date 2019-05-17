package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Wishlist;

public interface IWishlistDao extends JpaRepository<Wishlist, Integer> {

}
