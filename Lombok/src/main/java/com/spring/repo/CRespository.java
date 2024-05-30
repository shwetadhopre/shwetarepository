package com.spring.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.model.Company;
@Repository
public interface CRespository extends CrudRepository<Company, Integer>
{



}
