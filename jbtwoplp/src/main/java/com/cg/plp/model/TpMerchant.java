package com.cg.plp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "thirdpartymerchant")
public class TpMerchant {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq")
	@SequenceGenerator(name = "seq", sequenceName = "seq123_tpmerchantId", allocationSize = 1)
	private int tpmerchantId;
	private String tpmerchantName;
	private String tpmerchantEmail;
	private String tpmerchantPassword;
	private String tpmerchantPhone;
	private String tpmerchantAddress;
	private String tpmerchantShopname;
	private int tpproductId;
	public int getTpmerchantId() {
		return tpmerchantId;
	}
	public void setTpmerchantId(int tpmerchantId) {
		this.tpmerchantId = tpmerchantId;
	}
	public String getTpmerchantName() {
		return tpmerchantName;
	}
	public void setTpmerchantName(String tpmerchantName) {
		this.tpmerchantName = tpmerchantName;
	}
	public String getTpmerchantEmail() {
		return tpmerchantEmail;
	}
	public void setTpmerchantEmail(String tpmerchantEmail) {
		this.tpmerchantEmail = tpmerchantEmail;
	}
	public String getTpmerchantPassword() {
		return tpmerchantPassword;
	}
	public void setTpmerchantPassword(String tpmerchantPassword) {
		this.tpmerchantPassword = tpmerchantPassword;
	}
	public String getTpmerchantPhone() {
		return tpmerchantPhone;
	}
	public void setTpmerchantPhone(String tpmerchantPhone) {
		this.tpmerchantPhone = tpmerchantPhone;
	}
	public String getTpmerchantAddress() {
		return tpmerchantAddress;
	}
	public void setTpmerchantAddress(String tpmerchantAddress) {
		this.tpmerchantAddress = tpmerchantAddress;
	}
	public String getTpmerchantShopname() {
		return tpmerchantShopname;
	}
	public void setTpmerchantShopname(String tpmerchantShopname) {
		this.tpmerchantShopname = tpmerchantShopname;
	}
	public int getTpproductId() {
		return tpproductId;
	}
	public void setTpproductId(int tpproductId) {
		this.tpproductId = tpproductId;
	}
	@Override
	public String toString() {
		return "TPMerchant [tpmerchantId=" + tpmerchantId + ", tpmerchantName=" + tpmerchantName + ", tpmerchantEmail="
				+ tpmerchantEmail + ", tpmerchantPassword=" + tpmerchantPassword + ", tpmerchantPhone="
				+ tpmerchantPhone + ", tpmerchantAddress=" + tpmerchantAddress + ", tpmerchantShopname="
				+ tpmerchantShopname + ", tpproductId=" + tpproductId + "]";
	}
}