package com.training.builder;

import com.training.factory.InsuranceFactory;

/* ABSTRACT BUILDER */

public abstract class QuoteBuilder {

	private PolicyQuote quote;
	
	
	  public PolicyQuote getQuote() {
          return quote;
}
 //You can Use Factory to Create the different Policy Quote";
	  public void createNewQuote() { 
		  

             quote = new PolicyQuote("LifeInsurance",20,4500,"Qtr"); 
       }
public abstract void buildWithRider();
public abstract void buildWithoutRider();

}
