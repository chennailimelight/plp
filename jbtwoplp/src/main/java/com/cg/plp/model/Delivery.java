package com.cg.plp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "delivery")
public class Delivery {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "seq", sequenceName = "delivery_seq", allocationSize = 1)
	
	@Id
	private int deliveryID;
	private String deliveryDate;
	private String deliveryStatus;
	private int productQuantity;
	private int productID;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name= "delivery_inventory", joinColumns= {@JoinColumn(name="product_ID")}, inverseJoinColumns = {@JoinColumn(name= "iproduct_ID")})
	Set<Inventory> inventory=new HashSet<Inventory>();
	
}

