package com.training.dao;

public interface CustomerDAO {

	  public int insertCustomer(Customer cust);
	  public boolean deleteCustomer(Customer cust);
	  public Customer findCustomer(int id);
	  public boolean updateCustomer(Customer cust, int id);
	 
}
