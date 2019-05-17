package com.cg.plp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	@Column
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "cart_Sequence")
    @SequenceGenerator(name = "cart_Sequence", sequenceName = "sequence_cart")
	private int serialNumber;
	@Column(nullable=false)
	private int productId;
	@Column(nullable=false)
	private String productName;
	@Column(nullable=false)
	private int quantity;
	@Column(nullable=false)
	private int productPrice;
	@Column(nullable=false)
	private int merchantId;
	@Column(nullable=false)
	private int discountedPrice;
	
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
	public int getDiscountedPrice() {
		return discountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		this.discountedPrice = discountedPrice;
	}
	public int getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(int merchantId) {
		this.merchantId = merchantId;
	}
	@Override
	public String toString() {
		return "Cart [serialNumber=" + serialNumber + ", productId=" + productId + ", productName=" + productName
				+ ", quantity=" + quantity + ", productPrice=" + productPrice + ", merchantId=" + merchantId
				+ ", discountedPrice=" + discountedPrice + "]";
	}
}
