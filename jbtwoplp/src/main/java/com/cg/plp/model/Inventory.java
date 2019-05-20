package com.cg.plp.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "inventory")
public class Inventory {
	private int serial;
	private String productname;
	private  String productCategory;
	@Id
	private int iproductID;
	private int productStock; 
	
	@ManyToMany(mappedBy="inventory", fetch = FetchType.LAZY)
	Set<Delivery> delivery=new HashSet<Delivery>();
	
	
}