package com.webapp.springboot.myartgallery.product;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ProductInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;
	private String desc;
	private int price;
	
	public ProductInfo() {
		
	}

	public ProductInfo(int id, String name, String desc, int price) {
		super();
		this.id = id;
		this.name = name;
		this.desc = desc;
		this.price = price;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductInfo [id=" + id + ", name=" + name + ", desc=" + desc + ", price=" + price + "]";
	}

	public ProductInfo(String name, String desc, int price) {
		super();
		this.name = name;
		this.desc = desc;
		this.price = price;
	}

}
