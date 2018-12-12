package com.cg.springpro.dao;

import java.util.List;

import com.cg.springpro.dto.Customer;

public interface CustomerDao {
	public void addCustomer(Customer customer);
	public List<Customer> showAllCustomers();
	public Customer showBalance(String mobnum);
	public int deposit(String mobilenum,double amount);
	public int withdraw(String mobilenum,double amount);
	public void fundtransfer(String smobnum,String tmobnum,double amount);
	
}
