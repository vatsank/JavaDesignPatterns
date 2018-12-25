package com.training.abst.factory;

public class LifeInsuranceFactory {

	
	public static Insurance getInsurance(InsuranceAbstractFactory fac)
	{
		return fac.createMoneyBackInsurance();
	}
	
	
}
