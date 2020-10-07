package com.springDemo.test;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Specialist{
	@Value("gp")
	String degree;
	Integer id;
	Integer salary;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public String getDegree() {	
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}
	
}
