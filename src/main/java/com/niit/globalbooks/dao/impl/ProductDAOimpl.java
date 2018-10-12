package com.niit.globalbooks.dao.impl;

import java.util.*;

import javax.transaction.Transactional;

import org.hibernate.Session;
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
private Object session;
	public List<Product> getAllProducts() {
		List<Product> allProducts=new ArrayList<Product>();
		allProducts= sessionfactory.openSession().createQuery("from Product").list();
		return allProducts;
	}
	
	public Product getProductById(int productId) {
		Product product=(Product) sessionfactory.openSession().get(Product.class,productId);
		return product ;
		
		
	}

	public boolean addProduct(Product product) {
		try
		{
			System.out.println("Product name = "+product.getProductName());
			Session session=sessionfactory.openSession();
			session.save(product);
			session.flush();
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
		}
		//sessionfactory.getCurrentSession().save(product);
		//return true;
	}
	
	

	

	public boolean updateProduct(Product product) {
		System.out.println("Product ID = "+product.getProductId());
		Session session=sessionfactory.getCurrentSession();
		session.update(product);
		session.flush();
		return true;
	}

	

	public void deleteProduct(int productId) {
		Product p=getProductById(productId);
		sessionfactory.getCurrentSession().delete(p);
		
	}

	
}

	
	
	

