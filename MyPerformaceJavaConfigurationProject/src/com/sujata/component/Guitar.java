package com.sujata.component;

import org.springframework.stereotype.Component;


public class Guitar implements Instrument {

	@Override
	public void play() {
		System.out.println("TIN TIN TIN");

	}

}
