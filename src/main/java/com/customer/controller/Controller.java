package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.customer.model.Model;
import com.customer.repository.CustomerRepo;

@RequestMapping("/")
@RestController
@Service
public class Controller {

	@Autowired
	private CustomerRepo repo;
	
	@PostMapping("customer")
	public Model saveCustomer(@RequestBody Model Data) {
		System.out.println("Customer Added!!!");
	    return this.repo.save(Data);
	}
	
	@GetMapping("customer/{cid}")
	public Model showCustomer(@PathVariable("cid") Long cid) {
		
		Model Person = repo.getByCid(cid);
		return Person;
	}
	
}
