package com.cg.plp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cg.plp.model.Merchant;



public interface MerchantDao extends JpaRepository<Merchant,Integer> {
	
	/*
	 * @Query ("select m from Merchant m where m.status='Approved'") public
	 * List<Merchant> displayMerchant();
	 */

	//public List<Merchant> displayApprovedMerchant();

	

}