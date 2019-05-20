package com.cg.plp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.plp.model.Product;
import com.cg.plp.service.ProductService;

@RestController
/* @CrossOrigin(origins = "http://localhost:4200") */
public class ProductController {

	@Autowired
	ProductService service;

	
	/*
	 * @GetMapping(path = "/productofmerchant/{merchantid}") public List<Product>
	 * getAllProductOfMerchant(@PathVariable("merchantid") int merchantId) {
	 * 
	 * return service.getAllProductOfMerchant(merchantId); }
	 */

	
	@GetMapping(path = "/productsid/{Product_Id}")
	public Product findbyid(@PathVariable("Product_Id") Integer Product_Id) {

		return service.findById(Product_Id);

	}

	
	@GetMapping(path = "/allorders")
	public List<Product> findAll() {
		return service.findAll();

	}

	
	/*
	 * @GetMapping(path = "/viewbyproduct") public Iterable<MostView>
	 * viewByProduct() { return service.viewByProduct(); }
	 */
}
