package com.sun.xia.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sun.xia.bean.Product;
import com.sun.xia.persistence.ProductDao;
 
 

@Component(value="productService")
public class ProductService  {

	@Resource(name="productDao")
	ProductDao productDao; 	 
	
	@Transactional
	public void save(Product product) {
		productDao.save(product);		
	}

	@Transactional
	public List<Product> findAllProducts() {
		return productDao.findAllProducts();
	}

}
