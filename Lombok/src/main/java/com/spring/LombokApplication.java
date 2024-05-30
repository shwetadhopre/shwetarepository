package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.model.Company;

@SpringBootApplication
public class LombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(LombokApplication.class, args);
		
		Company c = new Company();
		     
              System.out.println(c.getId());
              System.out.println(c.getAdhar());
		
	}

}
