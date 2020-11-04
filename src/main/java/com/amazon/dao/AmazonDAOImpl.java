package com.amazon.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.amazon.model.ProductDetails;
import com.amazon.rowmapper.AmazonRowMapper;
@Repository
public class AmazonDAOImpl implements AmazonDAO{
	
	@Autowired
	JdbcTemplate jbbcTemplate;
	
	
	@Override
	public String saveProducts(ProductDetails product) {
		System.out.println("entered dao layer"+product.getProductId());
		int isSuccess  = jbbcTemplate.update("insert into productdetails values(?,?,?,?)",new Object[] {product.getProductId(),product.getProductName(),product.getProductPrice(),product.getProductCategory()});
		System.out.println(isSuccess);
		return isSuccess==1?"Record saved succesfully ":"";
	}


	@Override
	public ProductDetails searchByName(String productName)throws Exception {
		System.out.println("entered dao layer"+productName);
		ProductDetails	product=jbbcTemplate.queryForObject("select *from productDetails where PNAME=?",  new AmazonRowMapper(),new Object[] {productName});
		return product;
	}


	@Override
	public List<ProductDetails> searchAll() {
		 List <ProductDetails> productlist=jbbcTemplate.query("select * from ProductDetails",  new AmazonRowMapper());
		return productlist;
	}


	@Override
	public String editDetails(Integer productPrice, String productName) {
		String issuccess="";
		System.out.println("entered dao layer"+productPrice+productName);
		int updated=jbbcTemplate.update("update productDetails set Price=? where PNAME=?", new Object[] {productPrice,productName});
		if(updated==1) {
			issuccess="updated successfully";
		}
		return issuccess;
	}


	@Override
	public String deleteDetails(Integer productId) {
		String issuccess="";
		int isdeleted=jbbcTemplate.update("delete productDetails where PId=?", new Object[] {productId});
		if(isdeleted==1) {
			issuccess="deleted successfully";
			
		}
		return issuccess;
	}

}
