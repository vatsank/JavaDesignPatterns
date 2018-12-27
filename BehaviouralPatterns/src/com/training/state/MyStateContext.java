package com.training.state;

public class MyStateContext {

	MyState mycurrentState;
	private double energyLevel=2000;
	
	public double getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(double energyLevel) {
		this.energyLevel = 2000;
	}

	public MyStateContext() {
		super();
		mycurrentState=new HappyState();
		
		
	}

	public void changeState(MyState newState){
	this.mycurrentState = newState;
	
	}
	 
	public String saySomething(){
	    return mycurrentState.showMessage(this);
	}

	
	
}
