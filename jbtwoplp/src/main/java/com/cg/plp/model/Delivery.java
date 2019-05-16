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
@Table(name = "delivery")
public class Delivery {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "seq", sequenceName = "invoice_seq", allocationSize = 1)
	
	@Id
	private int deliveryID;
	private String deliveryDate;
	private String deliveryStatus;
	private int productQuantity;
	
}

