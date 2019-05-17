package com.cg.plp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.IInventoryDao;
import com.cg.plp.model.Inventory;

@Service
public class IInventoryServiceImpl implements IInventoryService {

	@Autowired
	private IInventoryDao inventoryDao;

	@Override
	public void save(Inventory inventory) {
		inventoryDao.save(inventory);
	}

	@Override
	public void delete(Inventory inventory) {
		inventoryDao.delete(inventory);

	}

	@Override
	public Inventory findByProductId(Integer productId) {
		Inventory inventory = inventoryDao.findById(productId).get();
		return inventory;
	}

	@Override
	public List<Inventory> findAllProducts() {
		List<Inventory> inventory = inventoryDao.findAll();
		return inventory;
	}

	@Override
	public Inventory updateExistingProduct(Inventory inventory) {
		Inventory inventory1 = inventoryDao.getOne(inventory.getProductId());
		inventory1.setProductName(inventory1.getProductName());
		inventory1.setProductCategory(inventory1.getProductCategory());
		inventory1.setSerialNumber(inventory1.getSerialNumber());
		inventory1.setProductStock(inventory1.getProductStock());
		return inventoryDao.save(inventory1);

	}

}
