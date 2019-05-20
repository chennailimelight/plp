package com.cg.plp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.plp.model.Inventory;
import com.cg.plp.service.IInventoryService;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

	@Autowired
	private IInventoryService inventoryService;
	
	@PostMapping("/save")
	public void save(@RequestParam String productName, @RequestParam String productCategory,
			@RequestParam Integer SerialNumber, @RequestParam Integer productStock) {
		
		Inventory inventory = new Inventory();
		inventory.setProductName(productName);
		inventory.setProductCategory(productCategory);
		inventory.setSerialNumber(SerialNumber);
		inventory.setProductStock(productStock);
		inventoryService.save(inventory);
		
		}
	
	@GetMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer productId) {
		Inventory inventory=inventoryService.findByProductId(productId);
		inventoryService.delete(inventory);
	}
	
	@GetMapping("/viewAll")
	public List<Inventory> viewAll() {
		List<Inventory> inventory= inventoryService.findAllProducts();
		return inventory;
	}
	
	
	@GetMapping("/viewById/{id}")
	public Inventory viewProductById(@PathVariable("id") Integer productId) {
		return inventoryService.findByProductId(productId);
	}
	
	@PostMapping("/updateExixtingProduct")
	public void updateExistingProduct(@RequestParam Integer productId, @RequestParam String productName,
			@RequestParam String productCategory,
			@RequestParam Integer SerialNumber, @RequestParam Integer productStock) {
		Inventory inventory = inventoryService.findByProductId(productId);
		inventory.setProductName(productName);
		inventory.setProductCategory(productCategory);
		inventory.setSerialNumber(SerialNumber);
		inventory.setProductStock(productStock);
		inventoryService.updateExistingProduct(inventory);
	}
}

