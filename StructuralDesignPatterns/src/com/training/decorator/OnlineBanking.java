package com.training.decorator;

public class OnlineBanking extends FeatureDectorator {

	private BankAccount account;
	public OnlineBanking(BankAccount account) {
	    	this.account = account;
	}

	@Override
	public double fundTransfer() {
		// TODO Auto-generated method stub
		return 8000;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+5000;
	}


	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String chequeBookRequest(){
		
		return "Allowed";
	}
}
