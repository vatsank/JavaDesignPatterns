package com.training.abst.factory.example2;

public class PersonalLoan extends Loan {

	@Override
	public double getInterest() {
		// TODO Auto-generated method stub
		return 28				;
	}

	@Override
	public double getEligibility() {
		// TODO Auto-generated method stub
		return 100000;
	}

}
