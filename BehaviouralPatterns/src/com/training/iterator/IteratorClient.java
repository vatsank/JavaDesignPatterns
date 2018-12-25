package com.training.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorClient {

	
	public static void main(String[] args) {
		
		String[] skills={"Java","JEE","Spring","Hibernate"};
		
		
		SkillContainer  cont=new SkillContainer(skills);
		
		 StringIterator itr=cont.createIterator();
		 
		  while(itr.hasNext())
		  {
			  System.out.println(itr.next());
		  }
		  
		  
	}
}
