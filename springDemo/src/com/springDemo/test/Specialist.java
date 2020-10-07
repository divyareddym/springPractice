package com.springDemo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Specialist{
	@Value("gp")
	String degree;

	public String getDegree() {	
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
