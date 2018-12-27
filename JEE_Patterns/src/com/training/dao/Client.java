package com.training.dao;

public class Client {

	// create the required DAO Factory
	DAOFactory cloudscapeFactory =   
	  DAOFactory.getDAOFactory(1);

	// Create a DAO
	CustomerDAO custDAO = 
	  cloudscapeFactory.getCustomerDAO();

	// create a new customer
	int newCustNo = custDAO.insertCustomer(new Customer());

	// Find a customer object. Get the Transfer Object.
	Customer cust = custDAO.findCustomer(23);

}
