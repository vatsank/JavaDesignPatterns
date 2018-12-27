package com.training.dao;

public abstract class  DAOFactory {

	  public abstract CustomerDAO getCustomerDAO();
	  public abstract AccountDAO getAccountDAO();
	  public abstract OrderDAO getOrderDAO();

	  public static DAOFactory getDAOFactory(
		      int whichFactory) {
		  
		    switch (whichFactory) {
		      case 1: 
		          return new CloudscapeDAOFactory();
		      case 2    : 
		          return new OracleDAOFactory();      
		      case 3   : 
		          return new SybaseDAOFactory();
		      default :          
		          return null;
		    }

}
}
