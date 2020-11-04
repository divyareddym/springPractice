package com.amazon.amazonWeb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.amazon.model.ProductDetails;
import com.amazon.service.AmazonService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class AmazonController {
	@Autowired
	AmazonService amazonService;

	@RequestMapping("/save")
	public String saveProduct(@RequestBody ProductDetails product) {
		System.out.println("entered throgh request body"+product.getProductId()+product.getProductCategory()+product.getProductPrice()+product.getProductName()); 	
		String productsaved="";
		try {
		 if(product.getProductId()!=null&&product.getProductCategory()!=null&&product.getProductPrice()!=null&&product.getProductName()!=null){
			productsaved= amazonService.saveProduct(product);
		}else{
			productsaved="give proper details";
		}
		}catch(Exception e) {
			productsaved="product already exist enter new product with new details";
		}
		return productsaved;
	}

	@GetMapping("/searchByName/{pname}")
	public String searchByName(@PathVariable("pname") String productName){
		System.out.println("productName:"+ productName);
		ObjectMapper mapper= new ObjectMapper();
		String result="";
		try {
			ProductDetails productDetails = amazonService.searchByName(productName);
			result = mapper.writeValueAsString(productDetails);
		} catch (Exception e) {
			result="Results not found"; 
		}
		return result;
	}

	@GetMapping("/searchAll")
	public List<ProductDetails> searchAll() {
		System.out.println();
		return amazonService.searchAll() ;
	}

	@PutMapping("/edit")
	public String editDetails(@RequestParam Integer productPrice,@RequestParam String productName) {
		System.out.println(productPrice+productName);
		return amazonService.editDetails(productPrice, productName);

	}

	@DeleteMapping("/delete")
	public String deleteDetails(@RequestParam Integer productId) {
		System.out.println(productId);
		return amazonService.deleteDetails( productId);
	}
}
