package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Manju")
public class Juggler implements Performer {

	@Value("6")
	private int balls;
	
	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling "+balls+" balls");

	}

}
