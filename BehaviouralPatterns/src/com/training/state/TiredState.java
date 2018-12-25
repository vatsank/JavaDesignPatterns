package com.training.state;

public class TiredState implements MyState{

	@Override
	public String showMessage(MyStateContext ctx) {
		
		ctx.changeState(new TiredState());
		return "I am Tired we will discuss tomorrow";
		  
	}

}
