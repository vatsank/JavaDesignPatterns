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
		
		double amt =card.calculateMinimumAmtDue();
		System.out.println("Your Credit Card Due"+ amt);
		System.out.println("Your Savings Due"+super.calculate());
		
		return amt;
	}
	

}
