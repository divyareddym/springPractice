package com.springDemo.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springDemo.AppConfig;

public class DemoTest {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Hospital hos = context.getBean(Hospital.class);
		Specialist spl =hos.getSpecialist();
		System.out.println(spl.getDegree());
	
	}
}
