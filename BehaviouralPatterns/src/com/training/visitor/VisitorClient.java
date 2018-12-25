package com.training.visitor;
import java.util.*;
public class VisitorClient {

	public static void main(String[] args) {
		
		Secretary sec =new Secretary();
		
		List<Visitable> visits =new ArrayList<Visitable>();
		
		visits.add(new Universty(1500));
		visits.add(new College(2500));
		
		 sec.setItems(visits);
		 
		 System.out.println("Total Salary "+sec.calculateSalary());
		 
	}
}
