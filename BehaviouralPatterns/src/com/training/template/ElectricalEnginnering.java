package com.training.template;

public class ElectricalEnginnering extends BasicEngineering {

	@Override
	public double electives() {

		System.out.println("Electives := Circuit Theory");
		
		return 45;
	}

	@Override
	public double englishTest() {

		System.out.println("English =>Basic Level");
		
		return 55;
	}

	
}
