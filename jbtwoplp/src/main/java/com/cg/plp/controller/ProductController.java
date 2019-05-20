package com.cg.product.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cg.product.Product;
import com.cg.product.Service.ProductService;

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

	@GetMapping(path= "/prod/{Product_Id}")
	public ResponseEntity<Product> find(@PathVariable("Product_Id") Integer Product_Id)
	{
		Product prod =service.findById(Product_Id);
		return new ResponseEntity<Product>(prod,HttpStatus.CREATED);
	}
	
	@GetMapping(path= "/Category")
	public ResponseEntity<Product> Category()
		{
		List<Product> prodl=service.findAll();
		return new ResponseEntity<Product>(prodl,HttpStatus.CREATED);
		
		}
	
	/*
	 * @GetMapping(path = "/viewbyproduct") public Iterable<MostView>
	 * viewByProduct() { return service.viewByProduct(); }
	 */
}
