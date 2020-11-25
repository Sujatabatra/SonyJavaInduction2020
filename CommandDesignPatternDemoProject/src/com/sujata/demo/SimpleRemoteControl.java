package com.sujata.demo;

public class SimpleRemoteControl {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void buttonPressed(){
		command.execute();
	}
}
