package com.amazon.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.amazon.model.ProductDetails;

public interface AmazonService {
	String saveProduct(ProductDetails product);
	ProductDetails searchByName(String productName) throws Exception;
	List<ProductDetails> searchAll() ;
	 String editDetails(Integer productPrice, String productName);
	 String deleteDetails(@RequestBody Integer productId);
}
