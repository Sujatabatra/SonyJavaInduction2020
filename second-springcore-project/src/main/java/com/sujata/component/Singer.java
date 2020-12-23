package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Manas")
public class Singer implements Performer {

	@Value("LALALALALA")
	private String song;
	
	@Override
	public void perform() {
		System.out.println("Singer is singing "+song+"!!!");

	}

}
