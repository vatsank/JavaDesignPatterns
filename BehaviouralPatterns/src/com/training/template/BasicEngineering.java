package com.training.template;

public abstract class BasicEngineering {

	public double englishTest() {
		
		System.out.println("English - Internmediate Level");
		
		return 50;
	}
	
	public double mathsTest() {
		
		System.out.println("Maths - Advanced Level");
		
		return 50;
	}
	
	public abstract double electives();
	
	public final void assementTemplate() {
		
		double mark1 = englishTest();
		double mark2 = mathsTest();
		
		if(mark1 > 40 && mark2>45) {
		electives();
		} else {
			System.out.println("You cant take electives until you pass language");
		}
	}
}
