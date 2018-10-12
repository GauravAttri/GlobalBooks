package com.niit.globalbooks.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
	/*@GetMapping("/AllProduct")
	public String viewAllProducts(Model model)
	{
		model.addAttribute("Name","gaurav");
		return "AllProduct";
	}*/
}
