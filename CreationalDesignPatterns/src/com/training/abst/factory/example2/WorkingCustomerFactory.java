package com.training.abst.factory.example2;

public class WorkingCustomerFactory implements FinancialProductFactory {

	@Override
	public Loan getLoan() {
		// TODO Auto-generated method stub
		return new BankLoan();
	}

	@Override
	public Deposit getDeposit() {
		// TODO Auto-generated method stub
		return new FixedDeposit();
	}

}
