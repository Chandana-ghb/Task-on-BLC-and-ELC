package com.blc.elc;

public class ProductMain {

	public static void main(String[] args) {
		Product pro=new Product();
		pro.setProductDetails("Laptop",501,75000.0);
		System.out.println(pro.getProductdetails());

	}

}
