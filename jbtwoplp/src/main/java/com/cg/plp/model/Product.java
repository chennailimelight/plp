package com.cg.product;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

	@Entity
	@Table(name = "products")
	public class Product {

	    
	    @Column
	    @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "session_Sequence")
	    @SequenceGenerator(name = "session_Sequence", sequenceName = "product_123",initialValue=1,allocationSize=1)
	    private int Sno;
	    @Column(nullable=false)
	    private String ProductName;
	    @Column(nullable=false)
	    private String Category;
	    @Column(nullable=false)
	    private int Product_Id;
	    @Column(nullable=false)
	    private String Brand;
	    @Column(nullable=false)
	    private int Quantity ;
	    @Column(nullable=false)
	    private int Merchant_Id;
	    @Column(nullable=false)
	    private int Orig_Price;
	    @Column(nullable=false)
	    private int Disc_price;
	    @Column()
	    private int Rating=0;
	
	    
	    @OneToMany
		@JoinColumn(name="product_id")
		private List<Inventory> inventory;
	    
	    @OneToMany
		@JoinColumn(name="merchant_id")
		private List<Merchant> merchant;
	    
	    
	    
	    public int getSno() {
			return Sno;
		}
		public void setSno(int sno) {
			Sno = sno;
		}
		public String getProductName() {
			return ProductName;
		}
		public void setProductName(String productName) {
			ProductName = productName;
		}
		public String getCategory() {
			return Category;
		}
		public void setCategory(String category) {
			Category = category;
		}
		public int getProduct_Id() {
			return Product_Id;
		}
		public void setProduct_Id(int product_Id) {
			Product_Id = product_Id;
		}
		public String getBrand() {
			return Brand;
		}
		public void setBrand(String brand) {
			Brand = brand;
		}
		public int getQuantity() {
			return Quantity;
		}
		public void setQuantity(int quantity) {
			Quantity = quantity;
		}
		public int getMerchant_Id() {
			return Merchant_Id;
		}
		public void setMerchant_Id(int merchant_Id) {
			Merchant_Id = merchant_Id;
		}
		public int getOrig_Price() {
			return Orig_Price;
		}
		public void setOrig_Price(int orig_Price) {
			Orig_Price = orig_Price;
		}
		public int getDisc_price() {
			return Disc_price;
		}
		public void setDisc_price(int disc_price) {
			Disc_price = disc_price;
		}
		public int getRating() {
			return Rating;
		}
		public void setRating(int rating) {
			Rating = rating;
		}
		@Override
		public String toString() {
			return "Product [Sno=" + Sno + ", ProductName=" + ProductName + ", Category=" + Category + ", Product_Id="
					+ Product_Id + ", Brand=" + Brand + ", Quantity=" + Quantity + ", Merchant_Id=" + Merchant_Id
					+ ", Orig_Price=" + Orig_Price + ", Disc_price=" + Disc_price + ", Rating=" + Rating + "]";
		}
	    
	    
	    
	
	
	
	}

