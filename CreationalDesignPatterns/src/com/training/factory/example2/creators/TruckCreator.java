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
	String mode ="land";
	@Override
	public Transport createTransport() {

		 
		  if(this.mode.equals("land")) {
			  return new Truck();
		  }
		
		  if(this.mode.equals("flight")) {
			  return new Ship();
			  }
		  else return  null;
		  
		  
		 
	}

	@Override
	public void setRoute(String src, String destination) {

		 if(src.equals("chennai") && destination.equals("mumbai")){
			 this.mode = "flight";
		 } else {
			 this.mode =  "ship";
		 }
	}
	

	
}
