package com.training.abst.factory.example2;

public class SelfEmployedCustomerFactory implements FinancialProductFactory {

	@Override
	public Loan getLoan() {
		// TODO Auto-generated method stub
		return new PersonalLoan();
	}

	@Override
	public Deposit getDeposit() {
		// TODO Auto-generated method stub
		return new ProvidentFund();
	}

}
