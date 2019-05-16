package com.cg.plp.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "invoice")
public class Invoice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "seq", sequenceName = "invoice_seq", allocationSize = 1)
	private int invoicenum;

	public int getInvoicenum() {
		return invoicenum;
	}

	public void setInvoicenum(int invoicenum) {
		this.invoicenum = invoicenum;
	}

	@OneToMany(mappedBy = "cart", cascade =CascadeType.ALL,fetch=FetchType.EAGER) 
	private List<Cart> cart;

	@OneToOne
	@JoinColumn(name = "CUSTOMERADDRESS")
	private Customer customeraddress;

	@OneToOne
	@JoinColumn(name = "PRICE")
	private Product price;

}
