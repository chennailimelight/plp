package com.cg.plp.service;

import com.cg.plp.model.Invoice;

public interface IInvoiceService {
	public Invoice findById(Integer productId);
	public void delete(Invoice cart);
	public void save(Invoice cart);

}
