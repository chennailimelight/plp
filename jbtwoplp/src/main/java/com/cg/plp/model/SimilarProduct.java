package com.cg.plp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="products11")
public class SimilarProduct {
	  @Id
	    @Column
//	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "Product11_Sequence")
	    @SequenceGenerator(name = "session_Sequence", sequenceName = "Productsequence_11")
      private String ProductName;
	  private String ProductCategory;
	  private int ProductId;
	  private String ProductBrand;
	  private int ProductStock;
	  private int  MerchantId;
	  private int Price;
	  private int DiscountedPrice;
	 private int Rating;
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductCategory() {
		return ProductCategory;
	}
	public void setProductCategory(String productCategory) {
		ProductCategory = productCategory;
	}
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductBrand() {
		return ProductBrand;
	}
	public void setProductBrand(String productBrand) {
		ProductBrand = productBrand;
	}
	public int getProductStock() {
		return ProductStock;
	}
	public void setProductStock(int productStock) {
		ProductStock = productStock;
	}
	public int getMerchantId() {
		return MerchantId;
	}
	public void setMerchantId(int merchantId) {
		MerchantId = merchantId;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public int getDiscountedPrice() {
		return DiscountedPrice;
	}
	public void setDiscountedPrice(int discountedPrice) {
		DiscountedPrice = discountedPrice;
	}
	public int getRating() {
		return Rating;
	}
	public void setRating(int rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", ProductCategory=" + ProductCategory + ", ProductId="
				+ ProductId + ", ProductBrand=" + ProductBrand + ", ProductStock=" + ProductStock + ", MerchantId="
				+ MerchantId + ", Price=" + Price + ", DiscountedPrice=" + DiscountedPrice + ", Rating=" + Rating + "]";
	}
	  
	  
}
