package com.hand.service.impl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Customer;
import com.hand.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	private ApplicationContext ctx;

	public void addCustomer(Customer customer) {
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService customerService = (CustomerService) ctx.getBean("customerService");
		customerService.addCustomer(customer);
	}

	public Customer selectByFirstName(String firstName) {
		return null;
	}

	public Customer checkAddressId(int id) {
		return null;
	}

}
