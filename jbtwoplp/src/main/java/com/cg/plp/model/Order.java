package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cust_order")
public class Order {


	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq89_cus_id", allocationSize = 1)
	
	private int orderid;
	
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", productname=" + productname + ", productquantity=" + productquantity
				+ ", productprice=" + productprice + ", discountedprice=" + discountedprice + "]";
	}
	private String productname;
	private int productquantity;
	private int productprice;
	public int getProductprice() {
		return productprice;
	}
	public void setProductprice(int productprice) {
		this.productprice = productprice;
	}
	public int getDiscountedprice() {
		return discountedprice;
	}
	public void setDiscountedprice(int discountedprice) {
		this.discountedprice = discountedprice;
	}
	private int discountedprice;
	
	
	

	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getProductquantity() {
		return productquantity;
	}
	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}
	
	
	
	
	
}
