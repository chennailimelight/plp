package com.cg.plp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "wishlist")
public class Wishlist {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "wishlist_Sequence")
	@SequenceGenerator(name = "wishlist_Sequence", sequenceName = "wishlist_seq")
	private Integer serialNumber;
	@Column(nullable = false)
	private Integer productId;
	@Column(nullable = false)
	private String productName;
	@Column(nullable = false)
	private Integer productPrice;

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Integer getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Wishlist [productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ "]";
	}

}