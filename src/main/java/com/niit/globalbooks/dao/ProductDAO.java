package com.niit.globalbooks.dao;

import java.util.List;

import com.niit.globalbooks.model.Product;

public interface ProductDAO 
{
	public List<Product> getAllProducts();
	
	public Product getProductById(int productId);
	
	public boolean addProduct(Product product);
	
	public boolean updateProduct(Product product);
	
	 public void deleteProduct(int productId);




	}
