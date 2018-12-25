package com.training.command;

public class MyClient {

	
	public static void main(String[] args) {
		
		Waiter obj =new Waiter();
		
	Captain cap=new Captain();
	
	     cap.setCommand(obj);
	     
	     cap.executeOrder();
		
	}
}
