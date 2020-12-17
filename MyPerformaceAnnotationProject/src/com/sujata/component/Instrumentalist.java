package com.sujata.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Naveen")
public class Instrumentalist implements Performer {

	@Autowired //ByType autowiring
	@Qualifier("guitar")
	private Instrument instrument;

	public Instrumentalist() {
		super();
	}

	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.print("Instrumentalist is playing ");
		instrument.play();

	}

}
