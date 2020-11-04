package com.amazon.model;

public class ProductDetails {
	Integer productId;
	String productName;
	Integer productPrice;
	String productCategory;
	String isError;
	
	public String getIsError() {
		return isError;
	}
	public void setIsError(String isError) {
		this.isError = isError;
	}
	public Integer getProductId() {
		return productId;
	}
	public String getProductName() {
		return productName;
	}
	public Integer getProductPrice() {
		return productPrice;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public void setProductName(String i) {
		this.productName = i;
	}
	public void setProductPrice(Integer productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	

}
