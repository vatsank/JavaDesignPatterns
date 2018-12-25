package com.training.strategy;

public class CardPayment implements PaymentStrategy {

	@Override
	public void pay(double amount) {
		
		System.out.println("Recvied the Payment from Master Card");

	}

}
