package com.training.visitor.example2;

import java.util.*;

public class MinMaxFinder implements MyVisitor {

	Integer[] bookPrices;
	Integer[] provPrices;
	@Override
	public void visit(BookCart cart) {
	 
		this.bookPrices = cart.getBookList();

		
	}

	@Override
	public void visit(ProvCart cart) {
	
		this.provPrices = cart.getProvList();
	}
	
	private List<Integer> getMergedList(){
		List<Integer> list = new ArrayList(Arrays.asList(provPrices));
	      list.addAll(Arrays.asList(bookPrices));
	      return list;
	}

	public int findMininum() {
		
		List<Integer> list = getMergedList();
	  Integer least =    list.stream().min(Comparator.comparing(Integer::valueOf)).get();
	  
	      return least;
	}
	
    public int findMaximum() {
		
		List<Integer> list = getMergedList();
		
	  Integer max =    list.stream().max(Comparator.comparing(Integer::valueOf)).get();
	  
	      return max;
	}
	
}
