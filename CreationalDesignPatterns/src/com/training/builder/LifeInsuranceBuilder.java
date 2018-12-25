package com.training.builder;

public class LifeInsuranceBuilder extends QuoteBuilder {

	@Override
	public void buildWithRider() {
		
		PolicyQuote quote=getQuote();
		quote.setRiders("20% More since age is greater than 70");

	}

	@Override
	public void buildWithoutRider() {
	
		PolicyQuote quote=getQuote();
		quote.setRiders("No Rider for this Customer");


	}

}
