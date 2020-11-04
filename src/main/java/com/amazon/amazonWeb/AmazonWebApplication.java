package com.amazon.amazonWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.amazon"})
public class AmazonWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonWebApplication.class, args);
	}

}
