package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Merchant;

public interface MerchantDao extends JpaRepository<Merchant,Integer> {

}