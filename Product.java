package com.blc.elc;

public class Product {
	String productName;
	int productId;
	double price;
	
	public void setProductDetails(String name,int id,double prc) {
		productName=name;
		productId=id;
		price=prc;
	}
	public String getProductdetails() {
		return "Product Name: "+productName+"\nProduct Id: "+productId+"\nProduct Price: "+price;
	}
}
