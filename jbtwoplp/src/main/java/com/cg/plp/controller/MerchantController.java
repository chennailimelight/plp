package com.cg.plp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cg.plp.model.Merchant;
import com.cg.plp.service.MerchantServiceImpl;

@RestController
@RequestMapping("/merchant")
public class MerchantController {

	@Autowired
	private MerchantServiceImpl merchantService;
	Merchant merchant;

	@GetMapping("/")
	public List<Merchant> findAll() {
		List<Merchant> merchantList = merchantService.findAll();

		return merchantList;
	}

	@GetMapping("/save")
	public List<Merchant> save(/* @RequestParam int merchantId, */ @RequestParam String merchantName,
			@RequestParam String merchantEmail, @RequestParam String merchantPhone,
			@RequestParam String merchantAddress, @RequestParam String merchantShopname,
			@RequestParam Integer productId) {
		merchant = new Merchant();
		//merchant.setMerchantId(merchantId);
		merchant.setMerchantName(merchantName);
		merchant.setMerchantEmail(merchantEmail);
		merchant.setMerchantPhone(merchantPhone);
		merchant.setMerchantAddress(merchantAddress);
		merchant.setMerchantShopname(merchantShopname);
		merchant.setProductId(productId);

		merchantService.save(merchant);
		List<Merchant> merchantList = merchantService.findAll();

		return merchantList;
	}

	@GetMapping("/delete")
	public List<Merchant> delete(@RequestParam Integer merchantId) {
		Merchant merchant = merchantService.findById(merchantId);
		merchantService.delete(merchantId);
		List<Merchant> merchantList = merchantService.findAll();

		return merchantList;
	}
}
