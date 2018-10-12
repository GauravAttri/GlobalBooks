package com.niit.globalbooks.service;

import java.util.*;

import com.niit.globalbooks.model.Product;

public interface Productservice 
{
public List<Product> getAllProducts();

public Product getProductById(int productId);

public boolean addProduct(Product product);

public boolean updateProduct(Product product);

 public void deleteProduct(int productId);
}
