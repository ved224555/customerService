package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.customer.model.DemandModel;
import com.customer.model.FinalModel;
import com.customer.model.Model;
import com.customer.repository.CustomerRepo;

@RequestMapping("/")
@RestController
@Service
public class Controller {

	@Autowired
	private CustomerRepo repo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("customer")
	public Model saveCustomer(@RequestBody Model Data) {
		System.out.println("Customer Added!!!");
	    return this.repo.save(Data);
	}
	
	@GetMapping("customer/{cid}")
	public FinalModel showCustomer(@PathVariable("cid") Long cid) {
		FinalModel Data = new FinalModel();
		
		Model Person = repo.getByCid(cid);
		
		DemandModel product = restTemplate.getForObject("http://localhost:2001/demand/"+Person.getDid(), DemandModel.class);
		
		Data.setCus(Person);
		Data.setDem(product);
		return Data;
	}
	
}
