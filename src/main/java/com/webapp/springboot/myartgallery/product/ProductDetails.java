package com.webapp.springboot.myartgallery.product;

public class ProductDetails {
	
	private int pid;
	private String pname;
	private String pdescription;
	private int price;
	
	public ProductDetails(int pid, String pname, String pdescription, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.pdescription = pdescription;
		this.price = price;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPdescription() {
		return pdescription;
	}
	public void setPdescription(String pdescription) {
		this.pdescription = pdescription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ProductDetails [pid=" + pid + ", pname=" + pname + ", pdescription=" + pdescription + ", price=" + price
				+ "]";
	}
	

}
