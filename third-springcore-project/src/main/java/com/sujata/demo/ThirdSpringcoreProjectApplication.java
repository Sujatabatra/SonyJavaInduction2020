package com.sujata.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.sujata.component.Dancer;
import com.sujata.component.Juggler;
import com.sujata.component.Performer;
import com.sujata.component.Singer;

@SpringBootApplication
public class ThirdSpringcoreProjectApplication implements CommandLineRunner {

	@Autowired
	@Qualifier("Manas")
	private Performer performer;
	
	public static void main(String[] args) {
		SpringApplication.run(ThirdSpringcoreProjectApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		performer.perform();
		
	}
//	@Bean(name="Manas")
//	public Singer getSinger(){
//		Singer singer=new Singer();
//		singer.setSong("LALALALAL");
//		return singer;
//	}
//	
//	@Bean(name="Ganesh") 
//	public Dancer getDancer(){
//		Dancer dancer=new Dancer();
//		dancer.setStyle("Hip Hop");
//		return dancer;
//	}
//	@Bean(name="Manju")
//	public Juggler getJuggler(){
//		Juggler juggler=new Juggler();
//		juggler.setBalls(6);
//		return juggler;
//	}

	
	
	

}
