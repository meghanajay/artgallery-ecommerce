package com.webapp.springboot.myartgallery.product;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductController {

	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	private ProductService productService;

	@RequestMapping(value = "/products")
	public String listAllProductDetails(Model model) {
		model.addAttribute("productinfo", productService.getProducts());
		return "view-products";
	}
	
	@RequestMapping(value = "/add-product", method = RequestMethod.GET)
	public String showAddTodoPage(ModelMap model) {
		return "add-product";
	}
	
	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public String addProduct(ModelMap model, @RequestParam String desc, @RequestParam String name,
			@RequestParam int price) {
		productService.addProduct(name, desc, price);
		return "redirect:/products";
	}
	
	@RequestMapping(value = "/update-product/{id}", method = RequestMethod.GET)
	public String findById(ModelMap model, @PathVariable int id) {
		Optional<ProductInfo> prod = productService.findById(id);
		model.addAttribute("name", prod.get().getName());
		model.addAttribute("desc", prod.get().getDesc());
		model.addAttribute("price", prod.get().getPrice());
		model.addAttribute("id", prod.get().getId());
		return "update-product";
	}
	
	
	@RequestMapping(value = "/update-product/{id}", method = RequestMethod.POST)
	public String findById(ModelMap model, @RequestParam int id, @RequestParam String desc, @RequestParam String name,
			@RequestParam int price) {
		productService.updateProduct(id, name, desc, price);
		return "redirect:/products";
	}

}
