package com.training.command;

/* concrete commaand */

public class Waiter  implements MyCommand {

	Cook obj;
	
	@Override
	public void execute() {
	    	
		obj.prepareItems();
	}

	public Waiter() {
		super();
		obj=new Cook();
	}
	
	

}
