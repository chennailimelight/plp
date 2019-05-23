package com.cg.plp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.plp.model.Inventory;
import com.cg.plp.model.Merchant;
import com.cg.plp.model.Customer;
import com.cg.plp.service.IAdminService;

@CrossOrigin(origins = "http:localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/capg")
public class CapstoreController {
	@Autowired
	private IAdminService capservice;
	String verificationCode;
	public static String uemail;
	public static String upass;
	String uname;
	String key = "sdfsfsdfsddfsaee";
	Customer user = new Customer();
	Merchant merchant = new Merchant();

	@PostMapping(path = "/signin",produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public Customer signin(@RequestBody Customer user1) {
		System.out.println(capservice.encryptPassword(user1.getPassword()));
		user = capservice.findByEmailAndPassword(user1.getEmail(),capservice.encryptPassword(user1.getPassword()));
		return user;
		
	}

	@PostMapping(path = "/signup")
	public ModelAndView signup(@RequestParam String email, @RequestParam String password, @RequestParam String name) {
		System.out.println(email);
		ModelAndView modelandview = new ModelAndView("verification");
		uemail = email;
		upass = password;
		uname = name;
		verificationCode = capservice.generateCoupon();
		String Message = "Dear " + name + "\nPlease enter the following code to create an account:" + verificationCode
				+ " with CapStore!\nThanks\nTeam CapStore";
		String Subject = "Sign Up Verification";
		capservice.sendEmail(uemail, Subject, Message);
		return modelandview;
	}

	@PostMapping(path = "/verify")
	public ModelAndView verify(@RequestParam String code) throws Exception {
		if (code.equalsIgnoreCase(verificationCode)) {
			String encryptedValue = capservice.encryptPassword(upass);
			user.setEmail(uemail);
			;
			user.setPassword(encryptedValue);
			user.setUname(uname);
			user.setToken(verificationCode);
			capservice.save(user);

			ModelAndView modelandview = new ModelAndView("index");
			return modelandview;
		} else {
			ModelAndView modelandview = new ModelAndView("incorrect");
			return modelandview;
		}

	}

	@PostMapping("/forgotpassword")
	public ModelAndView forgot(@RequestParam String email) throws Exception {

		user = capservice.findByEmail(email);
		if (user != null) {
			String tok = user.getPassword();
			String decryptedValue = capservice.decryptPassword(tok);
			String Subject = "Forgotten Password";
			String Message = "Dear " + user.getUname()
					+ "\nWe have received a forgotten password request. Your password is " + decryptedValue;
			capservice.sendEmail(email, Subject, Message);
			ModelAndView modelandview = new ModelAndView("SigninPage");
			return modelandview;
		} else
			return null;
	}

	@PostMapping("/changepassword")
	public ModelAndView changepassword(@RequestParam String email, @RequestParam String password,
			@RequestParam String newpwd, @RequestParam String newpswd) throws Exception {

		user = capservice.findByEmail(email);
		if (user != null) {
			String tok = user.getPassword();
			String pass = capservice.decryptPassword(tok);
			if (password.equalsIgnoreCase(pass) && newpwd.equalsIgnoreCase(newpswd)) {
				String encryptedValue = capservice.encryptPassword(newpswd);
				user.setPassword(encryptedValue);

				capservice.save(user);
			}
			ModelAndView modelandview = new ModelAndView("index");
			return modelandview;
		}
		return null;
	}

	@GetMapping(path = "/customers")
	public List<Customer> getCustomers() {
		return capservice.viewCustomer();
	}

	@GetMapping(path = "/merchants")
	public List<Merchant> getMerchants() {
		return capservice.viewMerchant();
	}

	@GetMapping(path = "/inventory")
	public List<Inventory> getInventory() {
		return capservice.viewInventory();
	}
	
}
