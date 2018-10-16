package com.capgemini.shoppingclient.entities;

import java.util.HashMap;


public class Product {
	private int productId;
	private String productName;
	private String productCategory;
	private double productPrice;
	private HashMap<String, Object> productSpecification;
	
	public Product() {
		super();
			}
	public Product(int productId, String productName, String productCategory, double productPrice,
			HashMap<String, Object> productSpecification) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productCategory = productCategory;
		this.productPrice = productPrice;
		this.productSpecification = productSpecification;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public HashMap<String, Object> getProductSpecification() {
		return productSpecification;
	}
	public void setProductSpecification(HashMap<String, Object> productSpecification) {
		this.productSpecification = productSpecification;
	}
	
	

}
