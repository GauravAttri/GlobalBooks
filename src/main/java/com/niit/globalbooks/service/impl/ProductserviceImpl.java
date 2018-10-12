package com.niit.globalbooks.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.globalbooks.dao.ProductDAO;
import com.niit.globalbooks.model.Product;
import com.niit.globalbooks.service.Productservice;
@Service
public class ProductserviceImpl implements Productservice
{
@Autowired
	ProductDAO productDao;
	
		public List<Product> getAllProducts()
		{
		return productDao.getAllProducts();
	    }

		
		public Product getProductById(int productId) 
		{
			return productDao.getProductById(productId);	
		}
		
		public boolean addProduct(Product product)
		{
			return productDao.addProduct(product);
		}
		
		public boolean updateProduct(Product product)
		{
			return productDao.updateProduct(product);
		}


		public void deleteProduct(int productId)
		{
			productDao.deleteProduct(productId);
			
		}


		

}
