package com.training.visitor.example2;

import java.util.*;

public class Application {

	public static void main(String[] args) {
	
		
		ShoppingBag bag = new ShoppingBag();
		
		 BookCart cart1 = new BookCart();
		 ProvCart cart2 = new ProvCart();
		 
		 List<MyVisitable> items = new ArrayList<>();
		 items.add(cart1);
		 items.add(cart2);
		 
           bag.setItems(items);
 
           System.out.println("least valued :"+ bag.findLeastValued());
	}

}
