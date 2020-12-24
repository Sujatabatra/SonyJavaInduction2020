package com.sujata.component;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Manju")
public class Juggler implements Performer,BeanNameAware {

	@Value("6")
	private int balls;
	private String name;

	public void setBalls(int balls) {
		this.balls = balls;
	}

	@Override
	public void perform() {
		System.out.println("Juggler is juggling " + balls + " balls!");
		int x=10/0;

	}

	@Override
	public void setBeanName(String arg0) {
		this.name=arg0;
		
	}

}
