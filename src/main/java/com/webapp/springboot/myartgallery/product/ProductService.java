package com.webapp.springboot.myartgallery.product;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	private static List<ProductDetails> productDetails = new ArrayList();
	private static int counter = 2;

	static {
		productDetails.add(new ProductDetails(1, "Ganesha", "A4 size pencil sketch", 400));
		productDetails.add(new ProductDetails(2, "Ocean", "A4 size painting", 200));
	}

	public List<ProductDetails> getProducts() {
		return productDetails;
	}

	public void addProduct(String prodName, String desc, int price) {
		productDetails.add(new ProductDetails(++counter, prodName, desc, price));
	}
}
