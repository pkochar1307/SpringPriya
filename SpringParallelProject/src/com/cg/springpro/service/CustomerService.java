package com.cg.springpro.service;

import java.util.List;

import com.cg.springpro.dto.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);
	public List<Customer> showAllCustomers();
	public Customer showBalance(String mobnum);
	public int depositAmount(String mobnum,double amount);
	public int withdrawAmount(String mobnum,double amount);
	public void fundtransfer(String sourcemobilenum,String targetmobilenum,double amount);
	

}
