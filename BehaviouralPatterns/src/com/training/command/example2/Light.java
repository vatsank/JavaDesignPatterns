package com.training.command.example2;

// Receiver
public class Light {

	 private boolean on;

	 public void switchOn(){
	    on = true;
	    System.out.println("Light :"+on);
	  }
	  public void switchOff(){
	    on = false;
	    System.out.println("Light :"+on);
	  }

}
