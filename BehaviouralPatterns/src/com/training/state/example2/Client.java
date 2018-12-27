package com.training.state.example2;

public class Client {

	public static void main(String[] args) {

		Parcel pkg = new Parcel();
		
		 pkg.printState();
		 
		 pkg.nextState();
		 pkg.printState();
		 
		 
		 pkg.nextState();
		 pkg.printState();
		 
		
		 
	}

}
