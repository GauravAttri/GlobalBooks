package com.niit.globalbooks.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.niit.globalbooks.model.Product;
import com.niit.globalbooks.service.Productservice;

@Controller
public class ProductsController
{
	@Autowired
	Productservice productservice;
	
	
	
	@RequestMapping("/AllProducts")
	public String getAllProduct(Model model)
	{
		List<Product> allProduct;
		allProduct=productservice.getAllProducts();
		model.addAttribute("allProducts",allProduct);
		return "AllProducts";
		
	}
	
	/*public String AllProducts(@PathVariable int pid, Model model)
	{
		Product product=productservice.getProductById(pid);
		model.addAttribute("product",product);
		return "AllProducts";
	}
*/
	}
	
	



