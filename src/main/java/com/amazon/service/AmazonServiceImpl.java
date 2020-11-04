package com.amazon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.amazon.dao.AmazonDAO;
import com.amazon.model.ProductDetails;
@Service
public class AmazonServiceImpl implements AmazonService{
	@Autowired
	AmazonDAO amazondao;

	@Override
	public String saveProduct(ProductDetails product) {
		System.out.println("enterd service layer"+product.getProductId());
		return amazondao.saveProducts(product);
	}

	@Override
	public ProductDetails searchByName(String productName) throws Exception {
		System.out.println("enterd service layer"+productName);
		return amazondao.searchByName(productName);
	}

	@Override
	public List<ProductDetails> searchAll() {
		return amazondao.searchAll();
	}

	@Override
	public String editDetails(Integer productPrice, String productName) {
		System.out.println("enterd service layer"+productPrice+productName);
		return amazondao.editDetails(productPrice, productName);
	}

	@Override
	public String deleteDetails(Integer productId) {
		return amazondao.deleteDetails(productId);
	}

}
