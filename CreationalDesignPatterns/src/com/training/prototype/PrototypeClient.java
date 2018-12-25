package com.training.prototype;
import java.util.*;

import com.training.domains.PolicyQuote;
public class PrototypeClient {

	public static void main(String[] args) {
		
		PolicyQuoteManager mgr =new PolicyQuoteManager();
		
		
		List<PolicyQuote> list1=mgr.loadData();
		
		System.out.println("Original List");
		for(PolicyQuote q :list1)
		{
			System.out.println(q);
			
		}
		
		List<PolicyQuote>  list2=null;
		try {
			
			 list2=(List<PolicyQuote>)mgr.clone();
			
			
			System.out.println("Prototype List");
			for(PolicyQuote q :list2)
			{
				System.out.println(q);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		      
		list2.add(new PolicyQuote("Fire", 2, 4590, "Mon"));
		
		      
		System.out.println("New List 2"+list2);
		System.out.println("New List 1"+list1);
		
		
	}
}
