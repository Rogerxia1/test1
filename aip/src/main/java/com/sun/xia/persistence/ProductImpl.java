package com.sun.xia.persistence;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.sun.xia.bean.Product;

 
@Component(value="productDao")
public class ProductImpl  implements ProductDao{
 
	@Resource
	SessionFactory sessionFactory;
	
	//@Transactional
 	public void save(Product product){
		sessionFactory.getCurrentSession().save(product);
		//getHibernateTemplate().save(product);
	}
 
 	public void update(Product product){
		sessionFactory.getCurrentSession().update(product);
	}
 
 	public void delete(Product product){
		sessionFactory.getCurrentSession().delete(product);
	}
 
	
	public Product findByProductCode(String sku, String type){
		List list = sessionFactory.getCurrentSession().createQuery("from Product p where p.sku= :sku and p.sale_type=:type").setParameter("sku", sku).setParameter("type",type).list();
				///.getgetHibernateTemplate().find("from Product where productCode=?",productCode);
		return (Product)list.get(0);
	}

	public List<Product> findAllProducts() {
		List list = sessionFactory.getCurrentSession().createQuery("from Product").list();
		///.getgetHibernateTemplate().find("from Product where productCode=?",productCode);
		return  list;
	}
 
}
