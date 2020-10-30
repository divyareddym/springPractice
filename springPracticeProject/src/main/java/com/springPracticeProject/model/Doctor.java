package com.springPracticeProject.model;

import org.springframework.stereotype.Component;

@Component
public class Doctor {
	
	Integer id;
	String name;
	Integer slary;
	
	public Doctor(){
		System.out.println("doctor object instantiated");
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Integer getSlary() {
		return slary;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSlary(Integer slary) {
		this.slary = slary;
	}
	

}
