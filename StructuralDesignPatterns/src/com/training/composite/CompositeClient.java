package com.training.composite;

public class CompositeClient {

	public static void main(String[] args) {
		
		AccountManager mgr=new AccountManager();
		
		mgr.add(new HousingLoanAccount());
		
		CarLoanAccount car =new CarLoanAccount();
		  
		mgr.add(car);
		
		double tot_due=mgr.showOutStanding();
		
		System.out.println("Your Total Due to Bank"+tot_due);
		
		
	}
}
