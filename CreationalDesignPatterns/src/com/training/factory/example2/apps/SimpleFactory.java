package com.training.factory.example2.apps;

import com.training.factory.example2.products.Ship;
import com.training.factory.example2.products.Transport;
import com.training.factory.example2.products.Truck;

public class SimpleFactory {


	public  static Transport getTransport(int key){
		
		switch (key) {
		case 1:
			return new Truck();
		case 2:
			return new Ship();

		default:
			return null;
		}
		
	}
}
