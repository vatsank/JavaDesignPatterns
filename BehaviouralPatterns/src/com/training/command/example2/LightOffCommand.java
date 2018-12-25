package com.training.command.example2;

/*
 *  Concrete Command
 */
public class LightOffCommand implements Command {

	private Light light;
	
	/**
	 * @param light
	 */
	public  LightOffCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {

		   this.light.switchOff();
	}

}
