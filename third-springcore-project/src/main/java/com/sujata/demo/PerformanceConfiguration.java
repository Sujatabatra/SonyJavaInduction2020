package com.sujata.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sujata.component.Dancer;
import com.sujata.component.Juggler;
import com.sujata.component.Singer;

@Configuration
public class PerformanceConfiguration {
	
	@Bean(name="Manas")
	public Singer getSinger(){
		Singer singer=new Singer();
		singer.setSong("LALALALAL");
		return singer;
	}
	
	@Bean(name="Ganesh") 
	public Dancer getDancer(){
		Dancer dancer=new Dancer();
		dancer.setStyle("Hip Hop");
		return dancer;
	}
	@Bean(name="Manju")
	public Juggler getJuggler(){
		Juggler juggler=new Juggler();
		juggler.setBalls(6);
		return juggler;
	}
}
