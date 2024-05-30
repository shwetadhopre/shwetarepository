package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.spring.model.Company;
import com.spring.service.CService;

@RestController
public class HomeController {
	@Autowired
	CService cs;

	@PostMapping("/dataadd")
	public ResponseEntity<Company> add(@RequestBody Company c) {
		System.out.println(c.getAddr());
		System.out.println(c.getName());
		Company d = cs.save(c);
		return new ResponseEntity<Company>(d, HttpStatus.OK);

	}

	@GetMapping("/getAll")
	public ResponseEntity<List<Company>> get() {
		List<Company> d = cs.findAll();

		return new ResponseEntity<List<Company>>(d, HttpStatus.OK);

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<Company> al(@RequestBody Company c, @PathVariable int id) {
		Company df = cs.saveData(c, id);
		return new ResponseEntity<Company>(df, HttpStatus.ACCEPTED);

	}

	@PutMapping("/list/{id}")
	public ResponseEntity<List<Company>> vv(@RequestBody List<Company> l, @PathVariable int id) {
		List<Company> de = cs.saveAll(l, id);
		return new ResponseEntity<List<Company>>(de, HttpStatus.OK);

	}

}
