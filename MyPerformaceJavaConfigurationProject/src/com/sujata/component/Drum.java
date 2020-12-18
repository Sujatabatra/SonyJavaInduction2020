package com.sujata.component;

import org.springframework.stereotype.Component;


public class Drum implements Instrument {

	@Override
	public void play() {
		System.out.println("DUM DUM DUM");

	}

}
