package com.training.visitor;
import java.util.*;
public class Secretary {

	   private List<Visitable> visits;
	   
	   public void setItems(List<Visitable> visits) {
	     this.visits = visits;
	   }
	   
	   public double calculateSalary()
	     {
	        VisitingProfessor prof=new VisitingProfessor(); 

	         for(Visitable item: visits)
	         {
	            item.accept(prof);
	         }
	        
	         double total_salary = prof.getSalary();
	        
	        return total_salary;
	        
	    }

}
