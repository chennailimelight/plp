package com.cg.plp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.model.TpMerchant;
import com.cg.service.TpMerchantServiceImpl;

@RestController
@RequestMapping("/merchant")
public class TpMerchantController {

	@Autowired
	private TpMerchantServiceImpl tpmerchantService;
	TpMerchant tpmerchant;

	@PostMapping("/")
	public List<TpMerchant> findAll() {
		List<TpMerchant> tpmerchantList = tpmerchantService.findAll();

		return tpmerchantList;
	}
	
	@PostMapping("login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {
		String a = username;
		String b = password;
		ModelAndView modelAndView = new ModelAndView();
		if (a.equals("admin") && b.equals("admin")) {
			modelAndView = new ModelAndView("addmerchant");

		}
		return modelAndView;
	}

	@PostMapping("login1")
	public ModelAndView login1(@RequestParam String username, @RequestParam String password) {
		String a = username;
		String b = password;
		ModelAndView modelAndView = new ModelAndView();
		if (a.equals("merchant") && b.equals("merchant")) {
			modelAndView = new ModelAndView("Inventory");

		}
		return modelAndView;
	}



	@PostMapping("/save")
	public List<TpMerchant> save(/* int merchantId, */

			String tpmerchantName,

			String tpmerchantEmail,String tpmerchantPassword,String tpmerchantPhone,

			String tpmerchantAddress, String tpmerchantShopname,

			Integer tpproductId
	 
																	)  {
		tpmerchant = new TpMerchant();
		//merchant.setMerchantId(22);
		tpmerchant.setTpmerchantName("a");
		tpmerchant.setTpmerchantEmail("a@gmail.com");
		tpmerchant.setTpmerchantPassword( "a");
		tpmerchant.setTpmerchantPhone("9876543210");
		tpmerchant.setTpmerchantAddress("a");
		tpmerchant.setTpmerchantShopname("a");
		tpmerchant.setTpproductId(1);

		tpmerchantService.save(tpmerchant);
		List<TpMerchant> tpmerchantList = tpmerchantService.findAll();

		return tpmerchantList;
	}

	
	
	@PostMapping("/delete")
	public List<TpMerchant> delete( Integer tpmerchantId) {
		TpMerchant tpmerchant = tpmerchantService.findById(3);
		tpmerchantService.delete(tpmerchantId);
		List<TpMerchant> tpmerchantList = tpmerchantService.findAll();

		return tpmerchantList;
	}
	
	@PostMapping("/update")
	public List<TpMerchant> update( Integer merchantId) {
		TpMerchant tpmerchant = tpmerchantService.findById(3);
		tpmerchantService.save(tpmerchant);
		List<TpMerchant> tpmerchantList = tpmerchantService.findAll();
		
		return tpmerchantList;
	}
}
