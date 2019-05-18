package com.cg.plp.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.search.entity.CustomerEntity;
import com.cg.capstore.search.entity.MerchantEntity;
import com.cg.capstore.search.entity.ProductEntity;
import com.cg.capstore.search.service.SearchServiceInterface;

@Configuration
@Controller
@RestController
@RequestMapping("/")
public class SearchController {

	@Autowired
	SearchServiceInterface service;

	/*
	 * @RequestMapping("/findCustomer") public ModelAndView
	 * findCustomer(@RequestParam String customerName) {
	 * 
	 * System.out.println("in controller"); System.out.println(customerName);
	 * List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
	 * customerList = (List<CustomerEntity>)
	 * service.findCustomerByName(customerName); for (CustomerEntity customerEntity
	 * : customerList) { System.out.println(customerEntity);
	 * 
	 * } return new ModelAndView("showcustomers", "customerlist", customerList);
	 * 
	 * }
	 */
	@RequestMapping("/findCustomer")
	public List<CustomerEntity> findCustomer(@PathVariable("customername") String customerName) {

		List<CustomerEntity> customerList = new ArrayList<CustomerEntity>();
		customerList = (List<CustomerEntity>) service.findCustomerByName(customerName);
		
		if(customerList==null) {
			return (List<CustomerEntity>) new ResponseEntity("Sorry! Products not found!", 
					HttpStatus.NOT_FOUND);
		}
		
		return  customerList;

	}
	

	/*
	 * @RequestMapping(value = "findMerchant") public ModelAndView
	 * findMerchantByName(@RequestParam String merchantName) { List<MerchantEntity>
	 * merchantlist = new ArrayList<MerchantEntity>(); merchantlist =
	 * (List<MerchantEntity>) service.findMerchantByName(merchantName); for
	 * (MerchantEntity merchantEntity : merchantlist) {
	 * System.out.println(merchantEntity);
	 * 
	 * } return new ModelAndView("showmerchants", "merchantlist", merchantlist);
	 * 
	 * }
	 */
	@RequestMapping(value = "findMerchant")
	public List<MerchantEntity> findMerchantByName(@PathVariable("merchantname") String merchantName) {
		List<MerchantEntity> merchantlist = new ArrayList<MerchantEntity>();
		merchantlist = (List<MerchantEntity>) service.findMerchantByName(merchantName);
		

		
		return merchantlist;

	}

	/*
	 * @RequestMapping(value = "/findAllProducts") public ModelAndView
	 * findAllProducts(@RequestParam String merchantName) { List<ProductEntity>
	 * productsList = new ArrayList<ProductEntity>(); productsList =
	 * (List<ProductEntity>) service.findAllProducts(merchantName); for
	 * (ProductEntity productEntity : productsList) {
	 * System.out.println(productEntity);
	 * 
	 * } return new ModelAndView("show", "productslist", productsList);
	 * 
	 * }
	 */
	@RequestMapping(value = "/findAllProducts")
	public List<ProductEntity> findAllProducts( @PathVariable("merchantEmail")String merchantEmail) {
		List<ProductEntity> productsList = new ArrayList<ProductEntity>();
		productsList = (List<ProductEntity>) service.findAllProducts(merchantEmail);
		for (ProductEntity productEntity : productsList) {
			System.out.println(productEntity);

		}
		return productsList;

	}

	@RequestMapping(value = "/findProducts")
	public ModelAndView findProducts(@RequestParam String productName) {
		System.out.println("in find products");
		List<ProductEntity> productsList = new ArrayList<ProductEntity>();
		productsList = (List<ProductEntity>) service.findProducts(productName);
		for (ProductEntity productEntity : productsList) {
			System.out.println(productEntity);

		}
		return new ModelAndView("showproducts", "productslist", productsList);

	}

}
