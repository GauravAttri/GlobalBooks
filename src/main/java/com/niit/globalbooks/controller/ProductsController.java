package com.niit.globalbooks.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;

import com.niit.globalbooks.model.Product;
import com.niit.globalbooks.service.Productservice;

@Controller
public class ProductsController {
	@Autowired
	Productservice productservice;

	@RequestMapping("/AllProducts")
	public String getAllProduct(Model model) {
		List<Product> allProduct;
		allProduct = productservice.getAllProducts();
		model.addAttribute("allProducts", allProduct);
		return "AllProducts";

	}

	@RequestMapping("/viewproducts/{id}")
	public String getProductById(@PathVariable("id") int productId, Model model) {
		Product product = productservice.getProductById(productId);
		model.addAttribute("product", product);
		return "viewproducts";

	}

	@RequestMapping(value = "/addProduct")
	public String addProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "addProduct";
	}

	@RequestMapping(value = "/addproduct", method = RequestMethod.POST)
	public String addProducts(@ModelAttribute("product") Product product, BindingResult result,
			HttpServletRequest request) {
		productservice.addProduct(product);
		MultipartFile image = product.getImage();
		Path path;
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		System.out.println("Product ID = " + product.getProductId());
		path = Paths.get(rootDirectory + "/WEB-INF/resources/images/" + product.getProductId() + ".png");

		System.out.println("Path = " + path);

		System.out.println("File name = " + product.getImage().getOriginalFilename());

		if (image != null && !image.isEmpty())

		{
			try

			{
				// filename=p.getImage().getOriginalFilename();
				image.transferTo(new File(path.toString()));
				System.out.println("Image uploaded");
			} catch (Exception ex) {

				System.out.println(ex.getMessage());

			}
		}
		return "redirect:/AllProducts";
	}

	@RequestMapping("/updateProduct/{id}")
	public String updateProduct(@PathVariable("id") int productId, Model model) {
		Product product = productservice.getProductById(productId);
		model.addAttribute("product", product);
		return "updateProduct";
	}

	/*@RequestMapping(value = "/updateproduct", method = RequestMethod.POST)
	public String updateProducts(@ModelAttribute("product") Product product, BindingResult result) {
		productservice.updateProduct(product);
		return "redirect:/AllProducts";

	}
*/
	
	
	
	@RequestMapping(value = "/updateProduct", method = RequestMethod.POST)
	public String updateProducts(@ModelAttribute("product") Product product, BindingResult result, Model model,HttpServletRequest request) {
		productservice.updateProduct(product);
		MultipartFile productImage = product.getImage();
		Path path;
		String rootDirectory = request.getSession().getServletContext().getRealPath("/");
		System.out.println("Product ID = "+product.getProductId());
		path = Paths.get(rootDirectory + "/WEB-INF/resources/images/" + product.getProductId() + ".png");

		System.out.println("Path = " + path);

		//System.out.println("File name = " + product.getImage().getOriginalFilename());

		if (productImage != null && !productImage.isEmpty())

		{
			try

			{
				// filename=p.getImage().getOriginalFilename();
				productImage.transferTo(new File(path.toString()));
				System.out.println("Image uploaded");
			} catch (Exception ex) {

				System.out.println(ex.getMessage());

			}
		}
		return "redirect:/AllProducts";
	}
	
	
	
	@RequestMapping("/deleteProduct/{id}")
	public String deleteProduct(@PathVariable("id") int id) {
		System.out.println("Product ID to be deleted = "+id);
		productservice.deleteProduct(id);
		return "redirect:/AllProducts";
	}

}
