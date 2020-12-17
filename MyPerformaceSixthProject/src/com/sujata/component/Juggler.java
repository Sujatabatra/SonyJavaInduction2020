package com.sujata.component;

import java.util.List;

public class Juggler implements Performer {

	private List<Integer> balls;

	public Juggler() {
		super();
	}

	public Juggler(List<Integer> balls) {
		super();
		this.balls = balls;
	}

	public void setBalls(List<Integer> balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling " + balls + " balls!");

	}

}
