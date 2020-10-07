package com.springDemo.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital{

	@Autowired
	Specialist specialist;
	
	public Hospital() {
		System.out.println("hospitol instantiated >>>");
	}

	public Specialist getSpecialist() {
		return specialist;
	}
	
	public void setSpecialist(Specialist specialist) {
		System.out.println("specialet obj instantiated >>");
		this.specialist = specialist;
	}

}
