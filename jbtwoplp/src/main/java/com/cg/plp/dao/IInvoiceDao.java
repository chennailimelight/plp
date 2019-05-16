package com.cg.plp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.plp.model.Invoice;

public interface IInvoiceDao extends JpaRepository<Invoice,Integer>
{

	Invoice FindByInvoicenum(Integer invoicenum);
	

}
