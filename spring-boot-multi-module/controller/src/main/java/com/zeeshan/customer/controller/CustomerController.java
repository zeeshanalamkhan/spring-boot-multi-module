package com.zeeshan.customer.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.zeeshan.customer.domain.Customer;
import com.zeeshan.customer.service.CustomerService;

@RestController
public class CustomerController {

	private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Autowired
	private CustomerService customerService;

	@GetMapping("/customer/{id}")
	public Customer getCustomer(@PathVariable("id") Integer id) {
		logger.info("Inside getCustomer() - CustomerController......");
		return customerService.getCustomerById(id);
	}
}
