package com.training.bridge;

public class Car extends Vechile {

	private String carNumber;
	
	
	public String getCarNumber() {
		return carNumber;
	}


	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}


	@Override
	public void sericeStatus() {
		
		workShop1.work();
		workShop2.work();
	}

	
}
