package com.hand.service;



import com.hand.dto.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	
	public Customer selectByFirstName(String firstName);
	
	public Customer checkCustomerId(int id);
	
	public void deleteIdOfPayment(int id);
	
	public void deleteIdOfRental(int id);
	
	public void deleteByCustomerId(int id);
}
