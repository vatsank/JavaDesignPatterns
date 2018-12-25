package com.training.observer;

public class ObserverClient {

	
	public static void main(String[] args) {
		
		Stock obj =new Stock();
		
		obj.addObserver(new StockObserver());
		
		obj.setQuantity(230);
		
	}
}
