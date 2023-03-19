package com.webapp.springboot.myartgallery.product;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo productRep;


	public List<ProductInfo> getProducts() {
		List<ProductInfo> productInfo = new ArrayList<ProductInfo>();
		productRep.findAll().forEach(prod -> productInfo.add(prod));
		return productInfo;
	}

	public void addProduct(String prodName, String desc, int price) {
		productRep.save(new ProductInfo(prodName, desc, price));
	}
	
	public Optional<ProductInfo> findById(int id) {
		return productRep.findById(id);
	}
	
	public void updateProduct(int id, String prodName, String desc, int price) {
		productRep.save(new ProductInfo(id, prodName, desc, price));
	}
}