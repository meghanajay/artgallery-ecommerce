package com.webapp.springboot.myartgallery.product;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

	@RequestMapping(value = "/add-product", method = RequestMethod.POST)
	public String addProduct(ModelMap model) {
		productService.addProduct((int) model.get("id"), (String) model.get("name"), (String) model.get("desc"),
				(int) model.get("price"));
		return "product";
	}

}
