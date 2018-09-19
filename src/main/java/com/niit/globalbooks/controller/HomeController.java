package com.niit.globalbooks.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String homePage()
	{
		return "index";
	}
	@ GetMapping("/AllProduct")
	public String viewAllProduct(Model model)
	{
		model.addAttribute("Name", "Rakesh");
		return "AllProduct";
	}
}
