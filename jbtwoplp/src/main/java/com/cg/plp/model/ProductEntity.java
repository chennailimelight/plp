package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;

@Configuration
@Entity
@Table(name = "merchant_product")

public class ProductEntity {
	@Id
	int product_Id;
	@NotNull
	String product_Name;
	String product_Category;
	String product_Description;
	double product_Price;
	String product_Image;
	int product_Quantity;
	String product_Discount;
	int timeForDiscount;
	String product_Promo;
	int timeForPromo;
	int numberOfProductSold;
	double sellingCost;
	double exchangeAmount;
	String merchant_email_Id;
	double product_Exchanged;

	public int getProduct_Id() {
		return product_Id;
	}

	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}

	public String getProduct_Name() {
		return product_Name;
	}

	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}

	public String getProduct_Category() {
		return product_Category;
	}

	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}

	public String getProduct_Description() {
		return product_Description;
	}

	public void setProduct_Description(String product_Description) {
		this.product_Description = product_Description;
	}

	public double getProduct_Price() {
		return product_Price;
	}

	public void setProduct_Price(double product_Price) {
		this.product_Price = product_Price;
	}

	public String getProduct_Image() {
		return product_Image;
	}

	public void setProduct_Image(String product_Image) {
		this.product_Image = product_Image;
	}

	public int getProduct_Quantity() {
		return product_Quantity;
	}

	public void setProduct_Quantity(int product_Quantity) {
		this.product_Quantity = product_Quantity;
	}

	public String getProduct_Discount() {
		return product_Discount;
	}

	public void setProduct_Discount(String product_Discount) {
		this.product_Discount = product_Discount;
	}

	public int getTimeForDiscount() {
		return timeForDiscount;
	}

	public void setTimeForDiscount(int timeForDiscount) {
		this.timeForDiscount = timeForDiscount;
	}

	public String getProduct_Promo() {
		return product_Promo;
	}

	public void setProduct_Promo(String product_Promo) {
		this.product_Promo = product_Promo;
	}

	public int getTimeForPromo() {
		return timeForPromo;
	}

	public void setTimeForPromo(int timeForPromo) {
		this.timeForPromo = timeForPromo;
	}

	public int getNumberOfProductSold() {
		return numberOfProductSold;
	}

	public void setNumberOfProductSold(int numberOfProductSold) {
		this.numberOfProductSold = numberOfProductSold;
	}

	public double getSellingCost() {
		return sellingCost;
	}

	public void setSellingCost(double sellingCost) {
		this.sellingCost = sellingCost;
	}

	public double getExchangeAmount() {
		return exchangeAmount;
	}

	public void setExchangeAmount(double exchangeAmount) {
		this.exchangeAmount = exchangeAmount;
	}

	public String getMerchant_email_Id() {
		return merchant_email_Id;
	}

	public void setMerchant_email_Id(String merchant_email_Id) {
		this.merchant_email_Id = merchant_email_Id;
	}

	public double getProduct_Exchanged() {
		return product_Exchanged;
	}

	public void setProduct_Exchanged(double product_Exchanged) {
		this.product_Exchanged = product_Exchanged;
	}

	@Override
	public String toString() {
		return "ProductEntity [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Category="
				+ product_Category + ", product_Description=" + product_Description + ", product_Price=" + product_Price
				+ ", product_Image=" + product_Image + ", product_Quantity=" + product_Quantity + ", product_Discount="
				+ product_Discount + ", timeForDiscount=" + timeForDiscount + ", product_Promo=" + product_Promo
				+ ", timeForPromo=" + timeForPromo + ", numberOfProductSold=" + numberOfProductSold + ", sellingCost="
				+ sellingCost + ", exchangeAmount=" + exchangeAmount + ", merchant_email_Id=" + merchant_email_Id
				+ ", product_Exchanged=" + product_Exchanged + "]";
	}

}
