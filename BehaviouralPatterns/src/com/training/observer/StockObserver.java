package com.training.observer;

import java.util.Observable;
import java.util.Observer;

public class StockObserver implements Observer {

	@Override
	public void update(Observable o, Object arg) {
		
		System.out.println("Stock Updated");
		System.out.println("New Quantity Added "+ arg );

	}

}
