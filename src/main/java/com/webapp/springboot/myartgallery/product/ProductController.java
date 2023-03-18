package com.webapp.springboot.myartgallery.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {

	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	private ProductService productService;

	@RequestMapping(value = "/productlists")
	public String listAllProductDetails(Model model) {
		model.addAttribute("productdetails", productService.getProducts());
		return "productlist";
	}
	
	@RequestMapping(value = "/addproduct")
	public String showproduct() {
		return "product";
	}

}
