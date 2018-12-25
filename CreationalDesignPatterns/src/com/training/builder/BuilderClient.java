package com.training.builder;
/* Client */
public class BuilderClient {

	public static void main(String[] args) {
		
		InsuranceAgent agent =new InsuranceAgent();
		
		LifeInsuranceBuilder builder =new LifeInsuranceBuilder();
		
		agent.setBuilder(builder);
		
		agent.construct1();
		
		PolicyQuote quote=agent.getPolicyQuote();
		
		System.out.println(quote+quote.getRiders());
		
		
       agent.construct2();
		
		PolicyQuote quote2=agent.getPolicyQuote();
		
		System.out.println(quote2+quote2.getRiders());
		
		
		
	}
}
