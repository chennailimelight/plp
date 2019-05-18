package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Configuration;

@Configuration
@Table(name = "admin_login")
@Entity
public class AdminEntity {

	String email_id;
	@NotNull
	String password;
	@NotNull
	String name;
	@NotNull
	long phoneNumber;

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

	@Override
	public String toString() {
		return "AdminEntity [email_id=" + email_id + ", password=" + password + ", name=" + name + ", phoneNumber="
				+ phoneNumber + "]";
	}

}
