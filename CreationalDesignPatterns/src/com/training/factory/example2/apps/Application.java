package com.training.factory.example2.apps;

import com.training.factory.example2.creators.Creator;
import com.training.factory.example2.creators.TruckCreator;
import com.training.factory.example2.products.Transport;

public class Application {

	public static void main(String[] args) {

		Creator factory = new TruckCreator();
		
		   Transport mode =  factory.createTransport();
		   
		   
		   System.out.println(mode.estimate(100));
		   
		   
	}

}
