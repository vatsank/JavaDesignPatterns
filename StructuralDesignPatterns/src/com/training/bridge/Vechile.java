package com.training.bridge;

public abstract class Vechile {

	  protected WorkShop workShop1;
	  protected WorkShop workShop2;
	
	  	public void setWorkShop1(WorkShop workShop1) {
		this.workShop1 = workShop1;
    	}

	  	public void setWorkShop2(WorkShop workShop2) {
			this.workShop2 = workShop2;
	    	}
		
	abstract public void sericeStatus();
}
