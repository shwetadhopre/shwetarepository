package com.spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Entity
@Getter
public class Company 
{
	@Id
     private int id;
     private String name;
	private String addr;
    private String adhar;
	
	
	
	
	
	
	
}
