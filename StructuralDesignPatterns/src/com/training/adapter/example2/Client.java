package com.training.adapter.example2;

import java.util.Iterator;

public class Client {

	
	Iterator<String> itr;

	public Client(Iterator<String> itr) {
		super();
		this.itr = itr;
	}
	
	public void printAll() {
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
	
	public static void main(String[] args) {
		
		
		 ProductList list = new ProductList();
		 
		ProductListAdapter adapter = new ProductListAdapter(list.getProduct());
		
		Client client = new Client(adapter);
		
		client.printAll();
		
		
		
		 
	}
}
