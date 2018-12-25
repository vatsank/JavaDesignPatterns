package com.training.decorator;

//Concrete Component

public class CurrentAccount extends BankAccount {

	

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return amount-0.01;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 5000;
	}

}
