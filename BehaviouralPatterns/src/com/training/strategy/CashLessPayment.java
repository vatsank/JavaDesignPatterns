package com.training.strategy;

public class CashLessPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		
		amount =amount -amount*0.10;
		System.out.println("Received Amount from TPA"+ amount);
		

	}

}
