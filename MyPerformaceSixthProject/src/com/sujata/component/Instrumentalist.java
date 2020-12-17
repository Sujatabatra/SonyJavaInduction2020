package com.sujata.component;

import java.util.Map;
import java.util.Set;

public class Instrumentalist implements Performer {

	private Map<String, Instrument> songsInstruments;

	public Instrumentalist() {
		super();
	}

	public Instrumentalist(Map<String, Instrument> songsInstruments) {
		super();
		this.songsInstruments = songsInstruments;
	}

	public void setSongsInstruments(Map<String, Instrument> songsInstruments) {
		this.songsInstruments = songsInstruments;
	}

	@Override
	public void perform() {
		Set<String> songs=songsInstruments.keySet();
		for(String song:songs) {
			System.out.print("Instrumentalist is playing ");
			songsInstruments.get(song).play();
			System.out.println(" on song "+song+" !!");
		}

	}

}
