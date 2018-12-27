package com.training.visitor.example2;

import java.util.Arrays;

public class LeastPriceFinder implements MyVisitor {

	int[] bookPrices;
	int[] provPrices;
	@Override
	public void visit(BookCart cart) {
	 
		this.bookPrices = cart.getBookList();

		
	}

	@Override
	public void visit(ProvCart cart) {
	
		this.provPrices = cart.getProvList();
	}

	public int findMininum() {
		
					return 12;
	}
}
