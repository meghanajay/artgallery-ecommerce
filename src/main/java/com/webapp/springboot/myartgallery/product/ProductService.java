package com.webapp.springboot.myartgallery.product;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private static List<ProductDetails> productdetails = new ArrayList();

	static {
		productdetails.add(new ProductDetails(1, "Ganesha", "A4 size pencil sketch", 400));
		productdetails.add(new ProductDetails(2, "Ocean", "A4 size painting", 200));
	}

	public List<ProductDetails> getProducts() {
		return productdetails;
	}

}
