package com.training.template;

public class Application {

	public static void main(String[] args) {
		
		
		BasicEngineering  branch1 = new MechanicalEnginner();
		
		branch1.assementTemplate();
		
		
		System.out.println("=====================");
		
		BasicEngineering branch2 = new ElectricalEnginnering();
		branch2.assementTemplate();
		
		
	}
}
