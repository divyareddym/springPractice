package com.amazon.dao;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.amazon.model.ProductDetails;

public interface AmazonDAO {
	String saveProducts(ProductDetails product);
	 ProductDetails searchByName(String productName) throws Exception;
	 List<ProductDetails> searchAll() ;
	 String editDetails(Integer productPrice, String productName);
	 String deleteDetails(@RequestBody Integer productId);
}
