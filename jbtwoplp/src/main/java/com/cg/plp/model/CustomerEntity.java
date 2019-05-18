package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;

@Configuration

@Table(name = "customer_login")
@Entity

public class CustomerEntity {
	@Id
	String email_id;

	@NotNull
	String password;
	String name;
	long phoneNumber;
	String address;

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "CustomerEntity [email_id=" + email_id + ", password=" + password + ", name=" + name + ", phoneNumber="
				+ phoneNumber + ", address=" + address + "]";
	}

}
