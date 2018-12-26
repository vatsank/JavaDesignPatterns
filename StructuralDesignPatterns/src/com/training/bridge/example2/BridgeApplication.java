package com.training.bridge.example2;

public class BridgeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Eye donation by Volunteers");
		
		AbstractDonar eyeVolunteer = 
				new RefinedEyeDonar(new ConcreteVoluntaryDonar());
		
		eyeVolunteer.applyDonarType();
		
		
        System.out.println("Eye donation by Paid Workers");
		
		AbstractDonar eyePaid = 
				new RefinedEyeDonar(new ConcretePaidDonar());
		
		eyePaid.applyDonarType();
		
		
		AbstractDonar bloodPaid = 
				new RefinedBloodDonar(new ConcretePaidDonar());
		
		bloodPaid.applyDonarType();
		
		
	}

}
