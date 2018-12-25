package com.training.factory.example2.creators;

import com.training.factory.example2.products.Ship;
import com.training.factory.example2.products.Transport;
import com.training.factory.example2.products.Truck;

/**
 *  Concrete Creator
 * @author Srivatsan
 *
 */
public class TruckCreator implements Creator {

	/* Factory Function 
	 * (non-Javadoc)
	 * @see com.training.creators.Creator#createTransport()
	 */
	String mode ="flight";
	@Override
	public Transport createTransport(String src, String destination) {

		findTransport(src, destination);
		 
		  if(this.mode.equals("land")) {
			  return new Truck(14,.5);
		  }
		
		  if(this.mode.equals("flight")) {
			  return new Ship();
			  }
		  else return  null;
		  
		  
		 
	}

	private void findTransport(String src, String destination) {

		 if(src.equals("chennai") && destination.equals("mumbai")){
			 this.mode = "land";
		 } else {
			 this.mode =  "ship";
		 }
	}
	

	
}
