package com.sujata.component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("Ganesh")
public class Dancer implements Performer {

	@Value("Hip Hop")
	private String style;

	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println("Dancer is dancing in " + style + " Style");

	}

}
