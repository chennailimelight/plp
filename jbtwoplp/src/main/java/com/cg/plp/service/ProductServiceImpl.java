package com.cg.product.Service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.product.Product;
import com.cg.product.dao.ProductDao;



@Service("service")
public class ProductServiceImpl implements ProductService {

	@PersistenceContext
	private EntityManager em;

	@Autowired
	private ProductDao productdao;

	@Override
	public List<Product> findAll() {
		List<Product> prodlist = productdao.findAll();
		return prodlist;
	}

	@Override
	public void save(Product product) {
		productdao.save(product);

	}

	@Override
	public Product findById(Integer Product_id) {
		Product product = productdao.findById(Product_id).get();
		return product;
	}
	
	@Override
	public Product editExistingProductDetails(Product product) {
		
		Product product1 = productdao.getOne(product.getProduct_Id());
		product1.setProductName(product1.getProductName());
		product1.setCategory(product1.getCategory());
		product1.setBrand(product1.getBrand());
		product1.setDisc_price(product1.getDisc_price());
		product1.setOrig_Price(product1.getOrig_Price());
		product1.setQuantity(product1.getQuantity());
		product1.setMerchant_Id(product1.getMerchant_Id());
		return productdao.save(product1);
	}
}
	