package com.cg.Shopping.Cart.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {

	@Id
	 @Column
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "inventory_Sequence")
   @SequenceGenerator(name = "inventory_Sequence", sequenceName = "inventory_seq")
   private int productId;
	
   @Column(nullable = false)
   private String productName;
   
   @Column(nullable = false)
   private String productCategory;
   
   @Column(nullable = false)
   private int SerialNumber;
   
   @Column(nullable = false)
   private int productStock;

   public int getSerialNumber() {
	return SerialNumber;
}
public void setSerialNumber(int serialNumber) {
	SerialNumber = serialNumber;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductCategory() {
	return productCategory;
}
public void setProductCategory(String productCategory) {
	this.productCategory = productCategory;
}
public int getProductId() {
	return productId;
}
public void setProductId(int productId) {
	this.productId = productId;
}
public int getProductStock() {
	return productStock;
}
public void setProductStock(int productStock) {
	this.productStock = productStock;
}
@Override
public String toString() {
	return "Inventory [SerialNumber=" + SerialNumber + ", productName=" + productName + ", productCategory="
			+ productCategory + ", productId=" + productId + ", productStock=" + productStock + "]";
}
   
   
}
