package com.hand.main;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Address;
import com.hand.dto.Customer;
import com.hand.service.AddressService;
import com.hand.service.CustomerService;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext  ctx = null;
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		CustomerService cs = (CustomerService) ctx.getBean("customerService");
		AddressService as = (AddressService) ctx.getBean("addressService");
		Customer customer = new Customer();
		customer.setStore_id(1);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入firstName:");
		String firstName = scanner.nextLine();
		customer.setFirst_name(firstName);
		
		System.out.println("请输入lastName:");
		String lastName = scanner.nextLine();
		customer.setLast_name(lastName);
		
		System.out.println("请输入email:");
		String email = scanner.nextLine();
		customer.setEmail(email);
		
		System.out.println("请输入addressId:");
		int addressId = scanner.nextInt();
		while(as.checkAddressId(addressId) == null){
			System.out.println("addressId输入有误，请重新输入");
			addressId = scanner.nextInt();
		}
		customer.setAddress_id(addressId);
		
		Date date = new Date();
		customer.setCreate_date(date);
		
		//插入前事件
		ctx.start();
		//插入
		cs.addCustomer(customer);
		//System.out.println("插入成功");

		//查询获取
		Customer customer2 = new Customer();
		customer2 = cs.selectByFirstName(firstName);
		String addressName = getAddress(addressId);
		System.out.println("ID："+customer2.getCustomer_id());
		System.out.println("FirstName:"+customer2.getFirst_name());
		System.out.println("LastName:"+customer2.getLast_name());
		System.out.println("Email:"+customer2.getEmail());
		System.out.println("Address:"+addressName);
		System.out.println("Create Date:"+customer2.getCreate_date());
		//插入后事件
		ctx.stop();
	}
	
	static String getAddress(int addressId){
		ApplicationContext ctx = null;
		ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		AddressService as = (AddressService) ctx.getBean("addressService");
		return as.getAddressName(addressId);
	}
}
