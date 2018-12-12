package com.cg.springpro.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customerdata")
public class Customer {
	@Id
	@Column(name="mob_num")
	@NotNull(message="Mobile Number cannot be Empty")
	String mobnum;
	@Column(name="cust_name")
	@NotEmpty(message="Customer Name cannot be Empty")
	String custname;
	@Column(name="acc_bal")
	@NotNull(message="Account Balance cannot be empty")
	double accbal;
	public String getMobnum() {
		return mobnum;
	}
	public void setMobnum(String mobnum) {
		this.mobnum = mobnum;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public double getAccbal() {
		return accbal;
	}
	public void setAccbal(double amount) {
		this.accbal = amount;
	}
	@Override
	public String toString() {
		return "Customer [mobnum=" + mobnum + ", custname=" + custname
				+ ", accbal=" + accbal + "]";
	}
	public Customer(String mobnum, String custname, Integer accbal) {
		super();
		this.mobnum = mobnum;
		this.custname = custname;
		this.accbal = accbal;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
