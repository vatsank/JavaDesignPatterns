package com.training.composite;
import java.util.*;
/* Composite */

public class AccountManager implements Account {

	private List<Account> accList;
		
	public AccountManager() {
		accList=new ArrayList<Account>();
	}

	public boolean add(Account obj)
	{
		boolean result=false;
	
		try {
			accList.add(obj);	
			result=true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}

	

	@Override
	public double showOutStanding() {
		
		double total=0.0;
		for(Account accObj :accList)
		{ 
			
			  total+=accObj.showOutStanding();
			
		}
		return total;
	}

	@Override
	public List<Account> getAccList() {
		
		return accList;
	}
	
	
	

}
