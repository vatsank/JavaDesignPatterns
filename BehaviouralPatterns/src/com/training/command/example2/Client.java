package com.training.command.example2;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Creates the Invoker
	    RemoteControl control = new RemoteControl();
	    
	    // Create the Receiver
	    Light light = new Light();
	    
	    // Creates the Command and Pass it to  the Receiver
	    Command lightsOn = new LightOnCommand(light);
	    Command lightsOff = new LightOffCommand(light);
	  
	    
	    // Invoker is passed with Command 
	  
	    control.setCommand(lightsOn);
	    // Invoker invokes the method
	  	    control.pressButton();
	  
	  	// Invoker is passed with Command 
	  		    control.setCommand(lightsOff);
	 // Invoker invokes the method
	  		    control.pressButton();

	}

}
