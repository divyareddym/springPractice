package com.amazon.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.amazon.model.ProductDetails;

public class AmazonRowMapper implements RowMapper<ProductDetails> {

	@Override
	public ProductDetails  mapRow(ResultSet rs, int rowNum) throws SQLException {

		ProductDetails pro=new ProductDetails();

		pro.setProductId((rs.getInt(1)));
		pro.setProductName((rs.getString(2)));
		pro.setProductPrice((rs.getInt(3)));
		pro.setProductCategory((rs.getString(4)));

		return pro;
	}
}
