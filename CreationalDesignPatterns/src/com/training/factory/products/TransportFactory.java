package com.training.factory.products;

public class TransportFactory {

	/**
	 *  Factory Method which creates Instances of  Sub classes of Transport
	 * @param src
	 * @param destination
	 * @return
	 */
	public Transport getTransport(String src, String destination) {
		
	    double distance = findDistance(src, destination);
	    
	    if(distance < 1000) {
	    	return new Lorry();
	    } else {
	    	return new Flight();
	    }
	    
	   	}
	
	/**
	 *  Utility Function to Determine the Distance between two places.
	 * @param src
	 * @param destionation
	 * @return
	 */
	public double findDistance(String src, String destionation) {
		
		double distance = 1000;
		 if(src.equalsIgnoreCase("chennai") && destionation.equalsIgnoreCase("mumbai")) {
			 distance = 500;
		 }
		 
		 return distance;
	}
}
