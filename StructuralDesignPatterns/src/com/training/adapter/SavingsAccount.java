package com.training.adapter;

import com.training.ifaces.BankAccount;

//Target Class
public class SavingsAccount implements BankAccount {

	@Override
	public double calculate() {
		
		System.out.println("Calling the Target Class Method");
		
		return 1000.00;
	}


}
