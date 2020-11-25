package com.sujata.client;

import com.sujata.demo.Light;
import com.sujata.demo.LightOffCommand;
import com.sujata.demo.LightOnCommand;
import com.sujata.demo.SimpleRemoteControl;

public class RemoteControlTest {

	public static void main(String[] args) {
		
		SimpleRemoteControl remote=new SimpleRemoteControl();
		
		Light tubeLight=new Light();
		
		remote.setCommand(new LightOffCommand(tubeLight));
		remote.buttonPressed();

	}

}
