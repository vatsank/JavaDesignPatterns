package com.training.decorator;

public class InternationalBanking extends FeatureDectorator {

	private BankAccount account;
	public InternationalBanking(BankAccount account) {
	    this.account=account;	
	
	}

	@Override
	public double fundTransfer() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double balanceToMaintain() {
		// TODO Auto-generated method stub
		return account.balanceToMaintain()+10000;
	}

	

	@Override
	public double deposit(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	 public String airportLoungeAccess(){
		 
		 return "Allowed";
	 }
}
