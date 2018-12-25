package com.training.bridge;

public class BuilderClient {

	
	public static void main(String[] args) {
		
		  Vechile vehicle1 = new Car();
		     vehicle1.setWorkShop1(new BodyShop());
		     vehicle1.setWorkShop2(new GeneralService());
		     
		  
		  vehicle1.sericeStatus();

	}
	
}
