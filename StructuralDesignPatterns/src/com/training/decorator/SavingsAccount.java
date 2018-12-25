package com.training.decorator;

//Concrete Component

public class SavingsAccount extends BankAccount {

	

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return amount;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return 1000;
	}

}
