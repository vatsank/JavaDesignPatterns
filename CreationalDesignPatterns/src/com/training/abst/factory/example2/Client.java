package com.training.abst.factory.example2;

public class Client {

	private FinancialProductFactory factory;

	public Client(FinancialProductFactory factory) {
		super();
		this.factory = factory;
	}
	
	public void getProducts() {
		
		System.out.println(factory.getDeposit().getInterestRate());
		
		System.out.println(factory.getLoan().getEligibility());
	
		 System.out.println(factory.getLoan().getInterest());
	}
	
	
	public static void main(String[] args) {
		
		 FinancialProductFactory fact1 = new SelfEmployedCustomerFactory();
		  
		 Client client1 = new Client(fact1);
		 
		 client1.getProducts();
		 
		 
		 FinancialProductFactory fact2 = new WorkingCustomerFactory();
		  
		 Client client2 = new Client(fact2);
		 
		 client2.getProducts();
		 
		 
		 
		 
		  
	}
}
