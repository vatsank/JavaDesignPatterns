package com.training.template;

public class MechanicalEnginner extends BasicEngineering {

	@Override
	public double electives() {

		System.out.println("Electives := Thermodynamics");
		
		return 65;
	}

}
