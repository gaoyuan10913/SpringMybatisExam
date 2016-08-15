package com.hand.service;

import java.util.List;

import com.hand.dto.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	
	public Customer selectByFirstName(String firstName);
	
	public Customer checkAddressId(int id);
}
