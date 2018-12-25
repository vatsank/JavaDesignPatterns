package com.training.abst.factory;

public class ClientApplication {

	
	public static void main(String[] args) {
		
		
		InsuranceAbstractFactory fact=new LifeInsuranceFactImpl();
		
		Insurance obj=LifeInsuranceFactory.getInsurance(fact);
		
		
		System.out.println(obj.getPolicyQuote());
		
		
	}
}
