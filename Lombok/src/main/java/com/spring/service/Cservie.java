package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.model.Company;
import com.spring.repo.CRespository;

@Service
public class Cservie implements CService
{

	@Autowired
	  CRespository cr;
	
	
	@Override
	public Company save(Company c)
	{
		 return cr.save(c);
		
	}


	@Override
	public List<Company> findAll() 
	{
		List<Company> al= (List<Company>) cr.findAll();
		return al;
	}


	@Override
	public Company saveData(Company c, int id) 
	{
	           
		      return cr.save(c);
	}


	@Override
	public List<Company> saveAll(List<Company> l, int id) 
	{
		
		return null;
	}


	


	

	


	




	
		
	
	
	
}
