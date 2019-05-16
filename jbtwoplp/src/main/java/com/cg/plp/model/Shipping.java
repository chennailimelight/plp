package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Shipping {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq_banks_id", allocationSize = 1)
	private int id;
	private String address;
	private int mobilenumber;
	private String email;
	private String payment;
	
	public Shipping() {

	}

	public Shipping(int id, String address, int mobilenumber, String email, String payment) {
		super();
		this.id = id;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.payment = payment;
	}

	public int getShippingid() {
		return id;
	}

	public void setShippingid(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(int mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	@Override
	public String toString() {
		return "shipping [id=" + id + ", address=" + address + ", mobilenumber=" + mobilenumber
				+ ", email=" + email + ", payment=" + payment + "]";
	}
	
	
	
}
