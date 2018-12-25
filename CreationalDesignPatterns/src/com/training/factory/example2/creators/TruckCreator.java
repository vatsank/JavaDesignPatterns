package com.training.factory.example2.creators;

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
	@Override
	public Transport createTransport() {

		//return  new Truck(200,0.10);
		 
		return new Transport() {
			
			@Override
			public double estimate(double distance) {
				// TODO Auto-generated method stub
				return 0;
			}
			
		};
		 
	}
	

	@Override
	public double showEstimate(double distance) {
			
		 Transport truck = createTransport();
		  
		 return truck .estimate(distance);
	}

}
