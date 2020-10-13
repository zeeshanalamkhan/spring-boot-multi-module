package com.zeeshan.customer.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zeeshan.customer.domain.Customer;
import com.zeeshan.customer.repository.CustomerRepository;
import com.zeeshan.customer.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService {

	private static final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public Customer getCustomerById(Integer customerId) {

		logger.info("inside getCusotmerById() - CustomerServiceimpl.......");

		return customerRepository.getCustomerById(customerId);
	}

}
