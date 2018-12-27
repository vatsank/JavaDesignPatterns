package com.training.visitor.example2;

import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;
public class ShoppingBag {

	
	List<MyVisitable> items ;

	public ShoppingBag() {
		super();
	  this.items = new ArrayList<>();
	}

	public List<MyVisitable> getItems() {
		return items;
	}

	public void setItems(List<MyVisitable> items) {
		this.items = items;
	}
	private MinMaxFinder getVisitor() {
		
		MinMaxFinder finder = new MinMaxFinder();
		 
		 for(MyVisitable eachItem :items) {
			 eachItem.accept(finder);
		 }
		
		 return finder;
	}
	 public int findLeastValued() {
		 
		  
		 int minValue  =getVisitor().findMininum();
		 return minValue;
	 }
	 
public int findHightValued() {
		 
		  
		 int minValue  =getVisitor().findMaximum();
		 return minValue;
	 }
	 
}
