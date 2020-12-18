package com.sujata.consumer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.component.Dancer;
import com.sujata.component.Drum;
import com.sujata.component.Guitar;
import com.sujata.component.Instrumentalist;
import com.sujata.component.Juggler;
import com.sujata.component.Singer;
import com.sujata.component.Tabla;

@Configuration
public class PerformanceConfig {

	@Bean(name = "Ganesh")
	public Dancer getDancer() {
		Dancer dancer = new Dancer();
		dancer.setStyle("Hip Hop");
		return dancer;
	}

	@Bean(name = "Manas")
	public Singer getSinger() {
		return new Singer("Any Song");
	}

	@Bean("Disha")
	public Singer getSinger1() {
		Singer singer = new Singer();
		singer.setSong("Dynamite");
		return singer;
	}

	@Bean("Manju")
	public Juggler getJuggler() {
		return new Juggler(5);
	}

	@Bean(name = "guitar")
	public Guitar guitar() {
		return new Guitar();
	}

	@Bean(name = "drum")
	public Drum drum() {
		return new Drum();
	}

	@Bean(name = "tabla")
	public Tabla tabla() {
		return new Tabla();
	}

	@Bean("Naveen")
	public Instrumentalist getInstrumentalist() {
		return new Instrumentalist(tabla());
	}
}
