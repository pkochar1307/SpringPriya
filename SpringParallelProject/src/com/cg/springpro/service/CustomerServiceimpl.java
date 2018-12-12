package com.cg.springpro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.springpro.dao.CustomerDao;
import com.cg.springpro.dto.Customer;
@Service("mobileservice")
@Transactional
public class CustomerServiceimpl implements CustomerService {
	@Autowired
	CustomerDao customerdao;
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerdao.addCustomer(customer);

	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		return customerdao.showAllCustomers();
	}

	@Override
	public Customer showBalance(String mobnum) {
		// TODO Auto-generated method stub
		return customerdao.showBalance(mobnum);
	}

	@Override
	public int depositAmount(String mobnum, double amount) {
		// TODO Auto-generated method stub
		customerdao.deposit(mobnum, amount);
		return 0;
	}

	@Override
	public int withdrawAmount(String mobnum, double amount) {
		// TODO Auto-generated method stub
		customerdao.withdraw(mobnum, amount);
		return 0;
	}

	@Override
	public void fundtransfer(String sourcemobilenum, String targetmobilenum,double amount) {
		// TODO Auto-generated method stub
		System.out.println("returning impl");
		customerdao.fundtransfer(sourcemobilenum, targetmobilenum, amount);
		
	}

}
