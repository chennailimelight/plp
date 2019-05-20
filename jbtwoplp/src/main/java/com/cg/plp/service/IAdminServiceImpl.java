package com.cg.plp.service;

import java.security.Key;
import java.util.List;
import java.util.Properties;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.CustomerDao;
import com.cg.plp.dao.IInventoryDao;
import com.cg.plp.dao.IMerchantDao;
import com.cg.plp.dao.IMerchantDao;
import com.cg.plp.model.Customer;
import com.cg.plp.model.Feedback;
import com.cg.plp.model.Inventory;
import com.cg.plp.model.Merchant;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	IMerchantDao merchant;
	@Autowired
	IInventoryDao inventory;
	@Autowired
	CustomerDao customer;

	String key = "sdfsfsdfsddfsaee";
	@Override
	public String generateCoupon() {
		int length = 10;
		String coupon = "";
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789" + "abcdefghijklmnopqrstuvxyz";
		for (int i = 0; i < length; i++) {
			int index = (int) ((AlphaNumericString.length()) * Math.random());
			coupon += AlphaNumericString.charAt(index);
		}
		return coupon;
	}

	@Override
	public List<Customer> viewCustomer() {
		return customer.findAll();
	}

	@Override
	public List<Merchant> viewMerchant() {
		return merchant.findAll();
	}

	@Override
	public List<Inventory> viewInventory() {
		return inventory.findAll();
	}

	public void sendEmail(String receiverEmail, String emailSubject, String emailMessage) {
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.starttls.enable", "true");
		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("capgeministore9@gmail.com", "capstore123!");
			}
		});
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(receiverEmail));
			message.setSubject(emailSubject);
			message.setText(emailMessage);
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void sendFeedback(Feedback feedback) {
		this.sendEmail(feedback.getEmail(), feedback.getSubject(), feedback.getMessage());
	}

	@Override
	public void sendCoupon(String receiverEmail) {
		String subject = "Welcome to CapStore. A special coupon has been added to your account.";
		String coupon = this.generateCoupon();
		String userName = "";
		String message = "Dear " + userName
				+ "\n\n Welcome to the CapStore as a token of appreciation we are giving you a special discount. Avail an extra 35% offer at Checkout.\nUse Coupon Code: "
				+ coupon;
		this.sendEmail(receiverEmail, subject, message);

	}
	@Override
	public String encryptPassword(String password) {
		String newpwd=password;
		String ALGO = "AES";
		byte[] keyValue;
		keyValue = key.getBytes();
		Key pkey = new SecretKeySpec(keyValue, ALGO);
		Cipher cp;
		String encryptedValue="";
		try {
			cp = Cipher.getInstance(ALGO);
			cp.init(Cipher.ENCRYPT_MODE, pkey);
			byte[] encval = cp.doFinal(newpwd.getBytes());
			encryptedValue = new BASE64Encoder().encode(encval);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return encryptedValue;
	}

	@Override
	public String decryptPassword(String password) {
		String tok = password;
		String ALGO = "AES";
		byte[] keyValue;
		System.out.println("token=" + tok);
		String decPassword="";
		try {
			keyValue = key.getBytes();
			Key nkey = new SecretKeySpec(keyValue, ALGO);
			Cipher c = Cipher.getInstance(ALGO);
			c.init(Cipher.DECRYPT_MODE, nkey);
			byte[] decodedValue = new BASE64Decoder().decodeBuffer(tok);
			byte[] decValue = c.doFinal(decodedValue);
			decPassword = new String(decValue);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return decPassword;
	}
}
