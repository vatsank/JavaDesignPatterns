package com.training.abst.factory.example2;

public interface FinancialProductFactory {

	public Loan getLoan();
	public Deposit getDeposit();
}
