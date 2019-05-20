package com.cg.plp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;

@Configuration

@Entity
@Table(name = "merchant_login")

public class MerchantEntity {
	@Id
	String email_Id;
	@NotNull
	String password;
	String name;
	String address;
	@Column(name = "Organization_name")
	String organization_name;
	long phoneNumber;

	public String getEmail_Id() {
		return email_Id;
	}

	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getOrganization_name() {
		return organization_name;
	}

	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "MerchantEntity [email_Id=" + email_Id + ", password=" + password + ", name=" + name + ", address="
				+ address + ", organization_name=" + organization_name + ", phoneNumber=" + phoneNumber + "]";
	}

}
