package com.cg.springpro.dao;

import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.springpro.dto.Customer;
@Repository("mobiledao")
public class CustomerDaoImpl implements CustomerDao {
	@PersistenceContext
	EntityManager em;
	Map<String,Customer> accountEntry;
	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		em.persist(customer);
		em.flush();
	}

	@Override
	public List<Customer> showAllCustomers() {
		// TODO Auto-generated method stub
		Query query = em.createQuery("FROM Customer");
		List<Customer> myAll = query.getResultList();
		return myAll;
	}

	@Override
	public Customer showBalance(String mobnum) {
		// TODO Auto-generated method stub
		Query querySearch = em.createQuery("From Customer where mobnum=:mobdata");
		querySearch.setParameter("mobdata",mobnum);
		Customer customer=(Customer) querySearch.getResultList().get(0);
		return customer;
	}

	@Override
	public int deposit(String mobilenum, double amount) {
		Customer cust=em.find(Customer.class, mobilenum);
		double amt=cust.getAccbal();
		amt=amt+amount;
		cust.setAccbal(amt);
		em.flush();
		return 0;
	}

	@Override
	public int withdraw(String mobilenum, double amount) {
		// TODO Auto-generated method stub
		Customer cust=em.find(Customer.class, mobilenum);
		double amt=cust.getAccbal();
		amt=amt-amount;
		cust.setAccbal(amt);
		em.flush();
		return 0;
	}

	@Override
	public void fundtransfer(String smobnum, String tmobnum,double amount) {
		// TODO Auto-generated method stub
		System.out.println("in fundtransferimpldao()");
		Customer scust=em.find(Customer.class, smobnum);
		Customer tcust=em.find(Customer.class,tmobnum);
		
		double amt1=scust.getAccbal();
		double amt2=tcust.getAccbal();
		amt1=amt1-amount;
		amt2=amt2+amount;
		scust.setAccbal(amt1);
		tcust.setAccbal(amt2);
		em.flush();
		
	}
	
	

	/*@Override
	public void updateMobile(int mobId) {
		// TODO Auto-generated method stub
		Query queryupdate = em.createQuery(" UPDATE Mobile SET mobNmae='Lava' , mobPrice='400' WHERE mobid=:mobdata");
		queryupdate.setParameter("mobdata",mobId);
		
		queryupdate.executeUpdate();
	}*/

}
