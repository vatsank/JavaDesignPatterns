package com.training.visitor.example2;

import java.util.*;
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
	
	 public int findLeastValued() {
		 
		 LeastPriceFinder finder = new LeastPriceFinder();
		 
		 for(MyVisitable eachItem :items) {
			 eachItem.accept(finder);
		 }
		 
		 int minValue  =finder.findMininum();
		 return minValue;
	 }
}
