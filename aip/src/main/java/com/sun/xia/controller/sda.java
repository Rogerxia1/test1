package com.sun.xia.controller;

import java.io.*;
import java.util.List;

import org.springframework.context.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sun.xia.bean.Product;
import com.sun.xia.service.ProductService;

public class sda {
	public static void main(String[] args) throws Exception {
		ApplicationContext appContext =   
		    	  new ClassPathXmlApplicationContext("com/sun/xia/config/root-context.xml");
		 
		ProductService productService = (ProductService)appContext.getBean("productService");
		 
		List<Product> lists = productService.findAllProducts();
		for(Product p: lists)
		{
			System.out.println(p);
		}
	 
	}
	
	public void a()
	{
		ApplicationContext appContext =   
		    	  new ClassPathXmlApplicationContext("com/sun/xia/config/root-context.xml");
		 
		ProductService productService = (ProductService)appContext.getBean("productService");
		 
		List<Product> lists = productService.findAllProducts();
		for(Product p: lists)
		{
			System.out.println(p);
		}
			
		//productService.save(product);
	}
}
