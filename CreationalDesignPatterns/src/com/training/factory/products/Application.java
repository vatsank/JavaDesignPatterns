package com.training.factory.products;

public class Application {

	public static void  printEstimate(Transport obj) {
		
		 System.out.println(obj.estimate());
		 
		 System.out.println(obj.getClass());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		TransportFactory factory = new TransportFactory();
		
		 Transport  logistics = factory.getTransport("chennai", "mumbai");
		
		 printEstimate(logistics);
		 
		 
		 Transport logistics2 = factory.getTransport("chennai", "kashmir");
	
		  printEstimate(logistics2); 
		 
		 
		 
		
	}

}
