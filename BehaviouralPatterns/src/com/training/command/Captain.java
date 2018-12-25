package com.training.command;
/* Invoker */
public class Captain {

	MyCommand command;
	
	
	public void executeOrder()
	{
		command.execute();
	}


	public void setCommand(MyCommand command) {
		this.command = command;
	}
	
	
	
}
