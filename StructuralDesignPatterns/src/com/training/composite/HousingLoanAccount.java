package com.training.composite;

import java.util.List;

/* LEAF -2*/

public class HousingLoanAccount implements Account {

	@Override
	public double showOutStanding() {
		
		return 45000.00;
		
	}

	@Override
	public boolean add(Account acc) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Account> getAccList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
