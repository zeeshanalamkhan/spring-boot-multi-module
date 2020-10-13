package com.zeeshan.customer.repository;

import com.zeeshan.customer.domain.Customer;

public interface CustomerRepository {

	public Customer getCustomerById(Integer customerId);

}
