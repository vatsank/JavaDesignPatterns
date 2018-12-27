package com.training.template;

public abstract class BasicEngineering {

	public void englishTest() {
		
		System.out.println("Internmediate Level");
	}
	
	public void mathsTest() {
		
		System.out.println("Advanced Level");
	}
	
	public abstract void electives();
	
	public final void assementTemplate() {
		
		englishTest();
		mathsTest();
		electives();
	}
}
