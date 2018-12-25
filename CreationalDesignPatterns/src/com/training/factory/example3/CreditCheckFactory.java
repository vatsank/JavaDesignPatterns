package com.training.factory.example3;

public class CreditCheckFactory {

	private String creditAgencyStatus ="online";
	public CreditChek createCreditCheck() {
		
		if(isAgencyUp())
		{ 
		 return new CreditChekOnline();
		} else {
			return new CreditCheckOffline();
		}
	}
	
       public boolean isAgencyUp() {
    	 
    	   if(creditAgencyStatus.equals("online"))
   		{
    	  return true;   
       }
    	   else return false;
       }
}
