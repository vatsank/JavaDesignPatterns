package com.training.adapter.example2;
import java.util.*;

// Adoptee
public class ProductList {

	private Vector<String> productList;

	public ProductList() {
		super();
		this.productList = new Vector();
		
		this.productList.add("computer");
		this.productList.add("printer");
		this.productList.add("ups");
		
	}
	
	
	public Enumeration<String> getProduct() {
		
		 return this.productList.elements();
	}
}
