package com.sujata.component;

public class Juggler implements Performer {

	private int balls;

	
	public Juggler(int balls) {
		super();
		this.balls = balls;
	}


	public void setBalls(int balls) {
		this.balls = balls;
	}


	@Override
	public void perform() {
		System.out.println("Juggler is juggling " + balls + " balls!");
		int x=10/0;

	}

}
