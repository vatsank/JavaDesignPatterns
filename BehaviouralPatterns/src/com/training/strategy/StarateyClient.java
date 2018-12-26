package com.training.strategy;

public class StarateyClient {

	public static void main(String[] args) {
		
		
		Patient p1 = new Patient();
		
			
		p1.setStrategy(new CashLessPayment());
		
		p1.makePayment(20500.00);
		
		
	}
}
