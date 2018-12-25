package com.training.composite;

import java.util.List;

/* LEAF-1 */

public class CarLoanAccount implements Account {

	List<Account> accList;
	
	@Override
	public double showOutStanding() {
		
		return 1200.00;
	}

	@Override
	public boolean add(Account acc) {
		accList.add(acc);
		return false;
	}

	public List<Account> getAccList() {
		return accList;
	}

	
	
	
}
