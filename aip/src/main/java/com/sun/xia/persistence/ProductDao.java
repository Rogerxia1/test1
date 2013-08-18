package com.sun.xia.persistence;

import java.util.List;

import com.sun.xia.bean.Product;

 
 
public interface ProductDao {
 
	void save(Product product);
	void update(Product product);
	void delete(Product product);
	Product findByProductCode(String stockCode, String type);
	List<Product> findAllProducts();
 
}