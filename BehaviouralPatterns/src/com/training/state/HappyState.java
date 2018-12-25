package com.training.state;

public class HappyState implements MyState {

	@Override
	public String showMessage(MyStateContext ctx) {
	
		ctx.changeState(new TiredState());
		return "I Am Happy will Work Now -with a energy level"+ctx.getEnergyLevel();
	}

}
