package com.sujata.demo;

public class LightOnCommand implements Command {

	private Light light;
	
	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
