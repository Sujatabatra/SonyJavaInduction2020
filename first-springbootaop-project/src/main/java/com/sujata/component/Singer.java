package com.sujata.component;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Manas")
public class Singer implements Performer,BeanNameAware {

	@Value("Jingle Bells")
	private String song;
	private String name;
	
	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println(name+" is singing " + song);

	}

	@Override
	public void setBeanName(String arg0) {
		this.name=arg0;
		
	}

}
