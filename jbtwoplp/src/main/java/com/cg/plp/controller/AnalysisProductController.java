package com.cg.BusinessAnalysis.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.BusinessAnalysis.model.Product;
import com.cg.BusinessAnalysis.service.IAnalysisProductService;

//@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/products")
public class AnalysisProductController {
	
	@Autowired
	private IAnalysisProductService service;
	
	@PostMapping("/productid")
    public ModelAndView findById(@RequestParam int productid){
		List<Product> ProductList = new ArrayList<Product>();
		ProductList=service.findProductById(productid);
		ModelAndView modelAndView = new ModelAndView("Search");
		modelAndView.addObject("PRODUCTLIST", ProductList);
        return  modelAndView;
    }
	
	@PostMapping("/category")
    public ModelAndView findBycategory(@RequestParam String category){
		List<Product> productList = new ArrayList<Product>();
		productList=service.findBycategory(category);
		ModelAndView modelAndView = new ModelAndView("Search");
		modelAndView.addObject("PRODUCTLIST", productList);
        return  modelAndView;
    }
	
	@PostMapping("/merchantid")
    public ModelAndView findByMerchantId(@RequestParam int merchantid){
		List<Product> productList = new ArrayList<Product>();
		productList=service.findByMerchantId(merchantid);
		ModelAndView modelAndView = new ModelAndView("Search");
		modelAndView.addObject("PRODUCTLIST", productList);
        return  modelAndView;
    }

}
