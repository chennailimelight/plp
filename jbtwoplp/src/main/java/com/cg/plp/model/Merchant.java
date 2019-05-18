package com.cg.plp.model;
package com.cg.CustomerProducts.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "merc_details2")
public class Merchant {
	@Id

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq80_cus_id", allocationSize = 1)
	private int id;

	

	private String name;
	private String email;
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getShopname() {
		return shopname;
	}

	public void setShopname(String shopname) {
		this.shopname = shopname;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	private String phone;
	private String address;
	private String shopname;
	private int productid;
	private int balance;
	

	@OneToMany(mappedBy = "merchant", cascade = CascadeType.ALL)
	private Set<MerchantTransaction> transaction = new HashSet<>();

	public Set<MerchantTransaction> getTransaction() {
		return transaction;
	}

	public void setTransaction(Set<MerchantTransaction> transaction) {
		this.transaction = transaction;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void addTransaction(MerchantTransaction transaction) {
		transaction.setMerchant(this); // this will avoid nested cascade
		this.getTransaction().add(transaction);
	}

}
