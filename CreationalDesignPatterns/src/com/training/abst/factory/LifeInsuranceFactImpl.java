package com.training.abst.factory;

public class LifeInsuranceFactImpl implements InsuranceAbstractFactory {

	@Override
	public Insurance createMoneyBackInsurance() {
		
		return new LifeInsurance();
	}

	@Override
	public Insurance createEndowmentInsurance() {
		// TODO Auto-generated method stub
		return new LifeInsurance();
	}

}
