package com.training.command.example2;

/*
 *  Invoker
 */
public class RemoteControl {

	
	  private Command command;
	  
	  /**
	 * 
	 */
	public RemoteControl() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setCommand(Command command){
	    this.command = command;
	  }
	  
	  public void pressButton(){
	    command.execute();
	  }

}
