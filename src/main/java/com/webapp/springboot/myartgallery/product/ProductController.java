package com.webapp.springboot.myartgallery.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	private ProductService productService;

	@RequestMapping(value = "/productlist")
	public String listAllProductDetails(Model model) {
		model.addAttribute("productdetails", productService.getProducts());
		return "productlist";
	}

	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		return "product";
	}

	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public String addProduct(ModelMap model, @RequestParam String desc, @RequestParam String name,
			@RequestParam int price) {
		productService.addProduct(name, desc, price);
		return "redirect:/productlist";
	}

}
