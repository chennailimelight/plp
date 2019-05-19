package com.cg.plp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.plp.model.Invoice;
import com.cg.plp.service.IInvoiceServiceImpl;

public class InvoiceController {
	
	@Autowired
	private IInvoiceServiceImpl service;
	@PostMapping("/invoice")
	public ModelAndView invoiceAdd(@RequestParam Integer productid,@RequestParam Integer Serial,
			@RequestParam String productName,
			@RequestParam Integer productPrice,@RequestParam Integer merchantId,
			@RequestParam Integer discountedPrice,@RequestParam Integer quantity) {
		Invoice cart=new Invoice();
		cart.setProductId(productid);
		cart.setProductName(productName);
		cart.setProductPrice(productPrice);
		cart.setMerchantId(merchantId);
		cart.setDiscountedPrice(discountedPrice);
		cart.setQuantity(quantity);
		cart.setSerialNumber(Serial);
		service.save(cart);
	//	List<Invice> cart1=service23.findAll();
		ModelAndView	modelAndView = new ModelAndView("invoicesave");
		modelAndView.addObject("AA", cart);
		return modelAndView;
		
	}
}
