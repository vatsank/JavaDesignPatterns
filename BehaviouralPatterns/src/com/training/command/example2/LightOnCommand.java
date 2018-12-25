package com.training.command.example2;

/*
 * Concrete Command
 */
public class LightOnCommand implements Command {

	private Light light;
	
	/**
	 * @param light
	 */
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
       this.light.switchOn();
	}

}
