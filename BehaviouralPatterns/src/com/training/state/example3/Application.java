package com.training.state.example3;

public class Application {

	public static void main(String[] args) {

		Employee ramesh = new Employee("Ramesh","developer");
						 	 ramesh.printState();
		 
		ramesh.nextState();
		ramesh.printState();
		 
	
	}

}
