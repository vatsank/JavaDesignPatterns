package com.training.prototype;

import com.training.domains.PolicyQuote;
import java.util.*;
public class PolicyQuoteManager implements Cloneable {

	List<PolicyQuote> quoteList ;

	public PolicyQuoteManager() {
		super();
		
	}
	
	
	public List<PolicyQuote> loadData(){
		
		quoteList=new ArrayList<PolicyQuote>();
		
		quoteList.add(new PolicyQuote("Life", 20, 14500.00, "QTR"));
		quoteList.add(new PolicyQuote("Medical", 2, 4500.00, "YRLY"));
		
		return quoteList;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		
		List<PolicyQuote> temp=new ArrayList<PolicyQuote>();
		
		
		for(PolicyQuote q :quoteList)
		{
			PolicyQuote quote=(PolicyQuote)q.clone();
			temp.add(quote);
			
		}
		return temp;
	}
	
	
	   
}
