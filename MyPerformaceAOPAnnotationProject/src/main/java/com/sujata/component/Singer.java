package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Manas")
public class Singer implements Performer {

	@Value("Any Song")
	private String song;

	public Singer(){
		
	}
	public Singer(String song) {
		super();
		this.song = song;
	}


	public void setSong(String song) {
		this.song = song;
	}
	@Override
	public void perform() {
		System.out.println("Singer is singing " + song);

	}

}
