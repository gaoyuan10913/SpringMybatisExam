package com.hand.service;

import com.hand.dto.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	public Customer selectByFirstName(String firstName);
}
