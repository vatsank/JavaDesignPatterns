package com.training.bridge.example2;

public class RefinedEyeDonar extends AbstractDonar {

	public RefinedEyeDonar(IDonarType donar) {
		super(donar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyDonarType() {

		System.out.println("Eye Donar Applied");
		donar.assignDonar();
	}

	
}
