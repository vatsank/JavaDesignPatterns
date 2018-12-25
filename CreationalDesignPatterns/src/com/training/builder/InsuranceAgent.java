package com.training.builder;

/* Director */

public class InsuranceAgent {

	private LifeInsuranceBuilder builder;

	public void setBuilder(LifeInsuranceBuilder builder) {
	      this.builder = builder;
	}
	public PolicyQuote  getPolicyQuote(){ 
	       return builder.getQuote(); 
	   }
	  public void construct1() {
	              builder.createNewQuote();
	              builder.buildWithRider();
	         
    }
	   public void construct2() {
          builder.createNewQuote();
          builder.buildWithoutRider();
       
}
}