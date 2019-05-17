package com.cg.plp.service;

import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.plp.dao.CapCustomer;
import com.cg.plp.dao.CapInventory;
import com.cg.plp.dao.CapMerchant;
import com.cg.plp.model.Customer;
import com.cg.plp.model.Merchant;

@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	IMerchantDao merchant;
	@Autowired
	IInventoryDao inventory;
	@Autowired
	ICustomerDao customer;
	
	@Override
	public void generateCoupon() {
		
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
	    public void sendCoupon(String receiverEmail){  
	          //Get properties object    
	          Properties props = new Properties();    
	          props.put("mail.smtp.host", "smtp.gmail.com");    
	          props.put("mail.smtp.socketFactory.port", "465");    
	          props.put("mail.smtp.socketFactory.class",    
	                    "javax.net.ssl.SSLSocketFactory");    
	          props.put("mail.smtp.auth", "true");    
	          props.put("mail.smtp.port", "465"); 
	          props.put("mail.smtp.starttls.enable", "true");
	          //get Session   
	          Session session = Session.getDefaultInstance(props,    
	           new javax.mail.Authenticator() {    
	           protected PasswordAuthentication getPasswordAuthentication() {    
	           return new PasswordAuthentication("capgeministore9@gmail.com","capstore123!");  
	           }    
	          });    
	          //compose message    
	          try {    
	           MimeMessage message = new MimeMessage(session);    
	           message.addRecipient(Message.RecipientType.TO,new InternetAddress(receiverEmail));    
	           String sub ="Coupon Generation";
	           String msg ="Dummy Message";
	           message.setSubject(sub);    
	           message.setText(msg);    
	           //send message  
	           Transport.send(message);    
	           System.out.println("message sent successfully");    
	          } catch (MessagingException e) {
	        	  e.printStackTrace();
	          }    
	             
	    }  
	}  
