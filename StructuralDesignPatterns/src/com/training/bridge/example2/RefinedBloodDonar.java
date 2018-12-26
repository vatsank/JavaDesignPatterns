package com.training.bridge.example2;

public class RefinedBloodDonar extends AbstractDonar {

	public RefinedBloodDonar(IDonarType donar) {
		super(donar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void applyDonarType() {

		System.out.println("Applying Blood Donar");
		
		donar.assignDonar();
		
	}

}
