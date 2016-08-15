package com.hand.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Customer;
import com.hand.service.CustomerService;



public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService cs = (CustomerService) ctx.getBean("customerService");
		Customer customer = cs.selectByFirstName("MARY");
		System.out.println(customer.getEmail());
	}
}
