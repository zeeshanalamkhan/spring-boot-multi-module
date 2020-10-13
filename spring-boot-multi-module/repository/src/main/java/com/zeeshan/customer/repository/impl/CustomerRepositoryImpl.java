package com.zeeshan.customer.repository.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.zeeshan.customer.domain.Customer;
import com.zeeshan.customer.repository.CustomerRepository;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository {

	private static final Logger logger = LoggerFactory.getLogger(CustomerRepositoryImpl.class);

	@Override
	public Customer getCustomerById(Integer customerId) {

		logger.info("inside getCusotmerById() - CustomerRepositoryImpl.......");
		return new Customer(customerId, "New Customer");
	}

}
