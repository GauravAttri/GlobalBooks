package com.niit.globalbooks.dao.impl;

import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.globalbooks.dao.ProductDAO;
import com.niit.globalbooks.model.Product;



@Repository
@Transactional
public class ProductDAOimpl implements ProductDAO
{
@Autowired
SessionFactory sessionfactory;
	public List<Product> getAllProducts() {
		List<Product> allProducts=new ArrayList<Product>();
		allProducts= sessionfactory.openSession().createQuery("from Product").list();
		return allProducts;
	}
	
	/*public Product getProductById(int pid) {
		Product product=(Product) sessionfactory.openSession().get(Product.class,pid);
		return product ;
		
		
	}*/
	
}
