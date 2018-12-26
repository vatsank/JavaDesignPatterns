package com.training.adapter.example2;

import java.util.Enumeration;
import java.util.Iterator;

public class ProductListAdapter implements Iterator<String> {

	Enumeration<String> productList;
	
	
	public ProductListAdapter(Enumeration<String> productList) {
		super();
		this.productList = productList;
	}

	@Override
	public boolean hasNext() {
		
		return this.productList.hasMoreElements();
	}

	@Override
	public String next() {
	
		return this.productList.nextElement();
	}

}
