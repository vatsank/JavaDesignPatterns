package com.training.adapter;

import com.training.ifaces.BankAccount;

/* Adapter */
public class AccountAdapter extends  SavingsAccount {

	CreditCard card;
	
	
	public AccountAdapter(CreditCard card) {
		super();
		this.card = card;
	}


	@Override
	public double calculate() {
		
		System.out.println("Your Credit Card Due"+ card.calculateMinimumAmtDue());
		System.out.println("Your Savings Due"+super.calculate());
		
		double amt =card.calculateMinimumAmtDue() + super.calculate();

		return amt;
	}
	

}
