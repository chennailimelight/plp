package com.cg.plp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "seq", sequenceName = "invoice_seq", allocationSize = 1)
	private int invoicenum;
	private int serialNumber;
	private int productId;
	private String productName;
	private int quantity;
	private int productPrice;
	private int merchantId;
	private int discountedPrice;
	private Customer customeraddress;
	private Product price;
	
	
	public int getInvoicenum() {
		return invoicenum;
	}
	public void setInvoicenum(int invoicenum) {
		this.invoicenum = invoicenum;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	public int getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public Customer getCustomeraddress() {
		return customeraddress;
	}
	public void setCustomeraddress(Customer customeraddress) {
		this.customeraddress = customeraddress;
	}
	public Product getPrice() {
		return price;
	}
	public void setPrice(Product price) {
		this.price = price;
	}
	
	
	


	


	/*
	 * @OneToMany(mappedBy = "cart", cascade =CascadeType.ALL,fetch=FetchType.EAGER)
	 * private List<Cart> cart;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "CUSTOMERADDRESS") private Customer customeraddress;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "PRICE") private Product price;
	 */

}
