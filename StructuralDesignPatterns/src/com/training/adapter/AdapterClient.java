package com.training.adapter;

public class AdapterClient {

	public static void main(String[] args) {
		
		
		CreditCard card =new CreditCard();
		
		AccountAdapter adapter=new AccountAdapter(card);
		
		double total = adapter.calculate();
		
		System.out.println("Your total dues :="+ total);
		 
	}
}
