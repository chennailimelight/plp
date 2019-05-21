package com.cg.plp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.plp.model.PlpProduct;
import com.cg.plp.service.PlpProductServiceImpl;

@RestController
@RequestMapping("/PlpProduct")
public class PlpProductController {

	@Autowired
	private PlpProductServiceImpl plpproductService;
	PlpProduct plpproduct;

	@GetMapping("/")
	public List<PlpProduct> findAll() {
		List<PlpProduct> plpproductList = plpproductService.findAll();

		return plpproductList;
	}
	
	@PostMapping("login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		String a = username;
		String b = password;
		ModelAndView modelAndView = new ModelAndView();
		if (a.equals("admin") && b.equals("admin")) {
			modelAndView = new ModelAndView("menu");

		}
		return modelAndView;
	}

	@GetMapping("/save")
	public List<PlpProduct> save(@RequestParam Integer serialNumber, 

			@RequestParam String productName,

			@RequestParam	String productCategory,@RequestParam Integer productId,@RequestParam String productBrand,

			@RequestParam	Integer productStock,@RequestParam Integer merchantId,

			@RequestParam	Integer price,@RequestParam Integer discountedPrice,@RequestParam Integer rating
	 
																	 ) {
		plpproduct = new PlpProduct();
		
		plpproduct.setSerialNumber(serialNumber);
		plpproduct.setProductName(productName);
		plpproduct.setProductCategory(productCategory);
		plpproduct.setProductId(productId);
		plpproduct.setProductBrand(productBrand);
		plpproduct.setProductStock(productStock);
		plpproduct.setMerchantId(merchantId);
		plpproduct.setPrice(price);
		plpproduct.setDiscountedPrice(discountedPrice);
		plpproduct.setRating(rating);

		plpproductService.save(plpproduct);
		List<PlpProduct> plpproductList = plpproductService.findAll();

		return plpproductList;
	}

	@GetMapping("/delete")
	public List<PlpProduct> delete( Integer productId) {
		PlpProduct plpproduct = plpproductService.findById(productId);
		plpproductService.delete(productId);
		List<PlpProduct> plpproductList = plpproductService.findAll();

		return plpproductList;
	}
}
