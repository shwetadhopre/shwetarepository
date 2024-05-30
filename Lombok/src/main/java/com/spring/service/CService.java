package com.spring.service;

import java.util.List;

import com.spring.model.Company;

public interface CService 
{

	Company save(Company c);

	List<Company> findAll();

	Company saveData(Company c, int id);

	List<Company> saveAll(List<Company> l, int id);

	

	
}
