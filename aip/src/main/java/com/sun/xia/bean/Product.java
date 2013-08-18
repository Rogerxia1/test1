package com.sun.xia.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@Column(name = "code", unique = false, nullable = false, length = 100)
	private String code;
	
	//code, title, cost, brand, unit, pic, available, description, companyName, weight, category, rrp_price, add_time
	@Column(name = "category", unique = false, nullable = false, length = 100)
	private String category;
	
	@Column(name = "description", unique = false, nullable = false, length = 200)
	private String description;
	
	@Column(name = "qty", unique = false, nullable = false, length = 200)
	private int qty;

	public Product()
	{
		
	}
	
	
	public Product(String code, String category, String description, int qty) {
		this.code = code;
		this.category = category;
		this.description = description;
		this.qty = qty;
	}


	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}


	public int getQty() {
		return qty;
	}


	public void setQty(int qty) {
		this.qty = qty;
	}


	@Override
	public String toString() {
		return "Product [code=" + code + ", category=" + category
				+ ", description=" + description + ", qty=" + qty + "]";
	}

	 
	
	
}
